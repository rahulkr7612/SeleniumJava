package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class parametrizationdemo {
    @Parameters({"courseName","cityName"})
    @Test
    public void searchOnlineClasses(String courseName,String cityName) throws InterruptedException {
        SoftAssert softassert = new SoftAssert();// we always need to create soft assert class
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searxhBox=  driver.findElement(By.name("q"));
        //we never add test data into test script
        searxhBox.sendKeys(courseName + cityName);//Test Data
        searxhBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }

    @Parameters({"courseName2","cityName2"})
    @Test
    public void searchOnlineClasses2(String courseName2,String cityName2) throws InterruptedException {
        SoftAssert softassert = new SoftAssert();// we always need to create soft assert class
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searxhBox=  driver.findElement(By.name("q"));
        //we never add test data into test script
        searxhBox.sendKeys(courseName2 + cityName2);//Test Data
        searxhBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}
