package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandleSSLDemo {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);//ByPass SSL
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://expired.badssl.com/");

        System.out.println(driver.getTitle());


    }
}
