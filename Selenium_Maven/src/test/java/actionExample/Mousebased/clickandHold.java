package actionExample.Mousebased;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class clickandHold {
    public static void main(String[] args)  {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement elementA= driver.findElement(By.xpath("//li[text()='A']"));
        Actions action = new Actions(driver);
        action.clickAndHold(elementA)
                .pause(Duration.ofSeconds(5))
                .release(elementA)
                .pause(Duration.ofSeconds(5))
                .build().perform();
        driver.close();


    }
}
