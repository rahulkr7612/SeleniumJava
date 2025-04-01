package ListenersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

//@Listeners(ListenersDemo.MyListener.class)//we can use this tag in case xml is not there to add listeners
public class OrangeHRM {

    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {

        driver = new ChromeDriver();
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
    void testURL()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/h/login");
        System.out.println("Hellow");
        System.out.println("Rahul");
    }
    @Test(priority = 3,dependsOnMethods = {"testURL"})
    void testTitle()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    void teardown()
    {
        driver.quit();
    }
}
