package TestNGDataProviderDemo;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class paramTest {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    void setup(String br) throws InterruptedException {

        switch (br) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid");return;//Return will exit from entire method no Test will execute further
        }





        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

    }
    @Test(priority = 1)
            void testLogo()
    {
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status,true);
    }
    @Test(priority = 2)
            void testTitle()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @Test(priority = 3)
    void testURL()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @AfterClass
    void teardown()
    {
        driver.close();
    }

}
