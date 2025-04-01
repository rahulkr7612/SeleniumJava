package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethodsdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
        //isDispalyed
        //WebElement logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
        //System.out.println("Logo=" + logo.isDisplayed());

        /*Boolean status = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
        System.out.println("Logo=" + status);*/

        /* Boolean EnableStatus =  driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).isEnabled();
        System.out.println("Enabled = "+ EnableStatus);*/

        //is Selected
        WebElement male= driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
        WebElement female =driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));

        System.out.println("Before Selection------------");
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());

        System.out.println("After Selection------------");
        male.click();
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());



    }
    }
