package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class JavaScriptExecutorDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver=new ChromeDriver();//used for JavascriptExecutor
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahul");
        WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));

        //Passing Text in Text Box , Alternative of send keys
        JavascriptExecutor js=(JavascriptExecutor) driver;//when Webdriver is used to store chrome driver , Type casting Required
        //JavascriptExecutor js=driver;//Works when chromeDriver is directly instantiated Type Casting Not Required

        js.executeScript("arguments[0].setAttribute('value','John')",inputbox);

        //driver.findElement(By.xpath("//input[@id='male']")).click();
        WebElement radio=driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",radio);


    }
}
