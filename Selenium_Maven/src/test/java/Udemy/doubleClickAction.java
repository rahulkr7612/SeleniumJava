package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class doubleClickAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();



        //input[@id='field2']
        //input[@id='field1']
        //button[normalize-space()='Copy Text']
        driver.switchTo().frame("iframeResult");
        WebElement box1= driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();
        box1.sendKeys("Welcome");

        //Double click action
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();
        System.out.println(box2.getText());
        //Validation
        if(box2.getAttribute("value").equals("Welcome"))
            System.out.println("Text Copied !");
        else
            System.out.println("Failed");
    }
}
