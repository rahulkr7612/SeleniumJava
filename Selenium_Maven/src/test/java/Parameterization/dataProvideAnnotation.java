package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataProvideAnnotation {

    @DataProvider(name = "test-data")//name defined in here as well as Test data provider
    public Object[][] dataProviderFunc(){//return type of data provide is 2d array of object
        return new Object[][]{
                {"Selenium","Pune"},
                {"Java","Mumbai"},
                {"Python","Nashik"}
        };
    }

    @Test(dataProvider = "test-data")
    public void searchOnlineClasses2(String courseName2,String cityName2) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searxhBox=  driver.findElement(By.name("q"));
        //we never add test data into test script
        searxhBox.sendKeys(courseName2 + " " + cityName2);//Test Data
        searxhBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }

}
