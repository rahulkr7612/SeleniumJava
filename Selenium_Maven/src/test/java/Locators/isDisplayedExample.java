package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isDisplayedExample
{
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://www.letskodeit.com/practice");
        WebElement element = driver.findElement(By.id("displayed-text"));
        WebElement show = driver.findElement(By.id("show-textbox"));
        WebElement hide = driver.findElement(By.id("hide-textbox"));
        System.out.println(element.isDisplayed());
        hide.click();
        System.out.println(element.isDisplayed());
        show.click();
        System.out.println(element.isDisplayed());
        Thread.sleep(3000);
        driver.close();
    }
}
