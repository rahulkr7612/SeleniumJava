package SeleniumDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class deselectDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.letskodeit.com/practice");
        WebElement dropdown=driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByValue("orange");
        Thread.sleep(3000);
        select.selectByVisibleText("Apple");
        Thread.sleep(3000);

       /* select.deselectByVisibleText("Apple");
        Thread.sleep(3000);
        select.deselectByValue("orange");
        Thread.sleep(3000);
        select.deselectByIndex(2);
        Thread.sleep(3000);*/

        select.deselectAll();
        driver.close();
    }
}
