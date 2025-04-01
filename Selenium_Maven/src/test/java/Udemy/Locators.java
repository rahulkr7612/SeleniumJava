package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        //By Name
        //WebElement searchBox = driver.findElement(By.name("search"));
        //searchBox.sendKeys("MacBook");

        //driver.findElement(By.name("search")).sendKeys("MacBook");

        //By id
        /*WebElement logo =driver.findElement(By.id("logo"));
        Boolean status=logo.isDisplayed();
        System.out.println("Display Status" + status);*/

        //By Link Text and Partial Link Text
        //driver.findElement(By.linkText("Tablets")).click();//Link Text
        //driver.findElement(By.linkText("Contact Us")).click();//Link Text
        //driver.findElement(By.partialLinkText("Tab")).click();//Partial Link Text

        //Classname
        //List<WebElement> headerlinks =driver.findElements(By.className("list-inline-item"));
        //System.out.println(headerlinks.size());

        //tagName
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
    }
}
