package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xapthdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        //xpath with single attribute
        //driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Tshirts");

        //xpath with multiple attribute
        driver.findElement(By.xpath("//input[@placeholder='Search store'][@name='q']")).sendKeys("Tshirts");
    }
}
