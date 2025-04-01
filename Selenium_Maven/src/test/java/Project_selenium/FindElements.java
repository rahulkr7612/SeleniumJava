package Project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions=new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver  = new ChromeDriver(chromeoptions);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        List<WebElement> allelement=driver.findElements(By.tagName("input"));
        System.out.println(allelement.size());
        for(WebElement e:allelement)
        {
            System.out.println(e);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
