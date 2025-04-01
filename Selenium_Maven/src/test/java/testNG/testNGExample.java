package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testNGExample {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethodDemo()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void testNGDemoMethod()
    {
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
    }
    @Test
    public void testNGDemoMethod2()
    {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }
    @Test
    public void testNGDemoMethod3()
    {
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");
    }

    @AfterMethod
    public void afterMethodDemo()
    {
        driver.close();
    }

}
