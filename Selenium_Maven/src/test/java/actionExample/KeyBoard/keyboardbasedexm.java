package actionExample.KeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardbasedexm {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement element = driver.findElement(By.name("q"));

        Actions action = new Actions(driver);
        action.moveToElement(element).click(element)
                .keyDown(Keys.SHIFT)
                .pause(Duration.ofSeconds(5))
                .sendKeys("t shirt")
                .pause(Duration.ofSeconds(5))
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
        element.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();

    }
}
