package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class parameterwithBeforeMethod {

    public static WebDriver driver;
    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodExample(String browserName)
    {
        if(browserName.contentEquals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
             driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
        } else if (browserName.contentEquals("firefox")) {
            //System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
             driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
        } else if (browserName.contentEquals("edge")) {
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
    }

    @Parameters({"courseName2","cityName2"})
    @Test
    public void searchOnlineClasses2(String courseName2,String cityName2) throws InterruptedException {
        WebElement searxhBox=  driver.findElement(By.name("q"));
        //we never add test data into test script
        searxhBox.sendKeys(courseName2 + cityName2);//Test Data
        searxhBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }

    @AfterMethod
    public void AfterMethodExample()
    {

    }
}
