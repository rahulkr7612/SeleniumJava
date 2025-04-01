package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //tag id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iphone");//tag is optional

        //tag class
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iphone");

        //tag attribute
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("iphone");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("iphone");


        //tag classname atrribute
        driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("iphone");
        driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("iphone");


    }
}
