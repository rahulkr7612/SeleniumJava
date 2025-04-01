package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class OpenlinkNewTab {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);

        WebElement Register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        act.keyDown(Keys.CONTROL).click(Register).keyUp(Keys.CONTROL).perform();

        //Switch to Registration Page

    }
}
