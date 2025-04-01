package Udemy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZoominZoomout {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().maximize();
        /*Thread.sleep(1000);
        driver.manage().window().minimize();
        Thread.sleep(1000);*/
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='50%'");
    }
}
