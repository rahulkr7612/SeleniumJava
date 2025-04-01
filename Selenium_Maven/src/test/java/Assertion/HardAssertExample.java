package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void HardAssert() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Rediffmail - Free Email for Login with Secure Access" , "Rediffmail title should be matched");//if this pass then only next statement will execute(Hard Assert)
        Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login Textbox should be enabled");
        driver.close();
    }

}
