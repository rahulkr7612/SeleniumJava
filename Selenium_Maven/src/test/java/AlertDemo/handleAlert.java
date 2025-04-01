package AlertDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class handleAlert {
    public static void main(String[] args) {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement elementA = driver.findElement(By.id("alertbtn"));
        WebElement alerttextbox = driver.findElement(By.id("name"));
        alerttextbox.sendKeys("Asa");
        elementA.click();
        Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        driver.close();
    }
}
