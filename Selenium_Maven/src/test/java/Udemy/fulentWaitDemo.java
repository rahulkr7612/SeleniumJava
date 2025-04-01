package Udemy;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class fulentWaitDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Declaration
        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement txtusername = mywait.until(new Function<WebDriver, WebElement>() { //For function class import com.google.common.base.Function;
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("import com.google.common.base.Function;"));
            }
        });
        txtusername.sendKeys("Rahul");

    }
}
