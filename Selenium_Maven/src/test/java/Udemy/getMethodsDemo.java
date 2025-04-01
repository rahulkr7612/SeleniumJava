package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Set;

public class getMethodsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        String windowid = driver.getWindowHandle();
        System.out.println("Window id "+windowid);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();//open new browser
        Set<String> windowids= driver.getWindowHandles();

        System.out.println(windowids);

    }
}
