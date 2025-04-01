package actionExample.Mousebased;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
    public static void main(String[] args) {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        WebElement elementA = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        Actions action = new Actions(driver);
        action.doubleClick(elementA).perform();
        driver.close();
    }
}
