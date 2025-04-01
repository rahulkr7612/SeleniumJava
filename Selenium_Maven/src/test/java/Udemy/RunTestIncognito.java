package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RunTestIncognito {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");


        String title= driver.getTitle();
        System.out.println(driver.getTitle());
        if(title.contains("nopCommerce"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

    }
}
