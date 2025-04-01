package Project_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions=new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver  = new ChromeDriver(chromeoptions);
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        driver.close();

    }
}
