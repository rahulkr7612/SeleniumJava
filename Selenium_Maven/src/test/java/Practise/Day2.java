package Practise;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day2 {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));


        /*driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();*/

        /*driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());*/
        /*driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        // Enter text into the prompt and accept
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("TM");
        alert.accept();*/

        JavascriptExecutor js =(JavascriptExecutor) driver;
        WebElement element= driver.findElement(By.xpath("//h2[text()='Slider']"));
        js.executeScript("arguments[0].scrollIntoView()",element);

        Actions action=new Actions(driver);
        WebElement slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

        action.dragAndDropBy(slider,100,200).perform();

    }
}
