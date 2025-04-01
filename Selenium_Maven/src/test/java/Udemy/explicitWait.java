package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//Expilicit wait decleration
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //use of Explicit wait
        WebElement textuserName= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        textuserName.sendKeys("Admin");

        WebElement textpwd= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        textpwd.sendKeys("admin123");

        WebElement buttonLogin= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        buttonLogin.click();

    }
}
