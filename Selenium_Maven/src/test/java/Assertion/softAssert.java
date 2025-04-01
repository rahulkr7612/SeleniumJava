package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
    @Test
    public void softAssertdemo() {
        SoftAssert softassert =new SoftAssert();// we always need to create soft assert class
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String title = driver.getTitle();
        softassert.assertEquals(title,"Rediffmail - Free Email for Login with Secure Access" , "Rediffmail title should be matched");//if this fail next statement will also execute(Soft Assert)
        softassert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login Textbox should be enabled");
        WebElement rememberelement=driver.findElement(By.id("remember"));
        rememberelement.click();
        softassert.assertFalse(rememberelement.isSelected(),"Remember is not clickable");
        softassert.assertAll();//Prints result of all assertion
        driver.close();
    }
    @Test
    public void softAssertdemo2() {
        SoftAssert softassert =new SoftAssert();// we always need to create soft assert class
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String title = driver.getTitle();
        softassert.assertEquals(title,"Rediffmail - Free Email for Login with Secure Access" , "Rediffmail title should be matched");//if this fail next statement will also execute(Soft Assert)
        softassert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login Textbox should be enabled");
        WebElement rememberelement=driver.findElement(By.id("remember"));
        rememberelement.click();
        softassert.assertFalse(rememberelement.isSelected(),"Remember is not clickable");
        softassert.assertAll();//Prints result of all assertion
        driver.close();
    }
    @Test
    public void softAssertdemo3() {
        SoftAssert softassert =new SoftAssert();// we always need to create soft assert class
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String title = driver.getTitle();
        softassert.assertEquals(title,"Rediffmail - Free Email for Login with Secure Access" , "Rediffmail title should be matched");//if this fail next statement will also execute(Soft Assert)
        softassert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login Textbox should be enabled");
        WebElement rememberelement=driver.findElement(By.id("remember"));
        rememberelement.click();
        softassert.assertFalse(rememberelement.isSelected(),"Remember is not clickable");
        softassert.assertAll();//Prints result of all assertion
        driver.close();
    }
    @Test
    public void softAssertdemo4() {
        SoftAssert softassert =new SoftAssert();// we always need to create soft assert class
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String title = driver.getTitle();
        softassert.assertEquals(title,"Rediffmail - Free Email for Login with Secure Access" , "Rediffmail title should be matched");//if this fail next statement will also execute(Soft Assert)
        softassert.assertTrue(driver.findElement(By.id("login1")).isEnabled(),"Login Textbox should be enabled");
        WebElement rememberelement=driver.findElement(By.id("remember"));
        rememberelement.click();
        softassert.assertFalse(rememberelement.isSelected(),"Remember is not clickable");
        softassert.assertAll();//Prints result of all assertion
        driver.close();
    }
}
