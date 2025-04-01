package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class RightClickAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act=new Actions(driver);
        //Right Click Action
        //act.contextClick(button).perform();
        Action myaction=act.contextClick(button).build();//creating action as build
        myaction.perform();//Performing Action
        //click on copy
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

        //close alert box
        driver.switchTo().alert().accept();


    }
}
