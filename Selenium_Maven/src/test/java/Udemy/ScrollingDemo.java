package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        //1)Scroll By Pixel
        //js.executeScript("window.scrollBy(0,1500)" , "");
        //System.out.println(js.executeScript("return window.pageYOffset;"));//pageXOffset for horizontal scroll

        //2)Scroll till Element is visible
        /*WebElement element= driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        js.executeScript("arguments[0].scrollIntoView()" , element);
        System.out.println(js.executeScript("return window.pageYOffset;"));*/

        //3) Scroll till end of page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll width for horizontal scroll
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(3000);
        //4)Scroll up to initial Position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//scroll width for horizontal scroll
    }
}
