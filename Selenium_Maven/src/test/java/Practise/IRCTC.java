package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class IRCTC {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");

/*        driver.findElement(By.xpath("(//input[@aria-autocomplete='list' and @role='searchbox'])[1]")).sendKeys("Pune");
        Actions act=new Actions(driver);
        WebElement ele=driver.findElement(By.xpath("//li[@role='option' ][1]"));
        act.moveToElement(ele).click().build().perform();*/
        driver.findElement(By.xpath("//span[text()='All Classes']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='AC First Class (1A)']")).click();

    }
}
