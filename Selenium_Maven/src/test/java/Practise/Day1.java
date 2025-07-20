package Practise;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class Day1 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahul");
        Actions act=new Actions(driver);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//button[text()='Point Me']"));
        WebElement element1 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        js.executeScript("arguments[0].scrollIntoView()",element);
        act.moveToElement(element).moveToElement(element1).click().build().perform();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dest= new File("C://Users//rahuls10//Downloads//Day56.PNG");
        src.renameTo(dest);


    }
}
