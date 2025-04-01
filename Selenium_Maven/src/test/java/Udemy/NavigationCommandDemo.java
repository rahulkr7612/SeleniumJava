package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationCommandDemo {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new ChromeDriver();

        //driver.navigate().to("https://demo.nopcommerce.com/");
        //URL myurl = new URL("https://demo.nopcommerce.com/");
        //driver.navigate().to(myurl);

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://www.orangehrm.com/");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}
