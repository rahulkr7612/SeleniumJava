package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //WebElement element = driver.findElement(By.cssSelector("input[class='signinbtn']"));
        /*WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        element.sendKeys("Tshirt");
        WebElement element = driver.findElement(By.xpath("//a[text()='Sell']"));
        WebElement element = driver.findElement(By.xpath("//a[starts-with(text(),'Customer')]"));
        element.click();
        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        element.sendKeys("Tshirt");
        element.clear();
        WebElement element = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
        System.out.println(element.getText());*/
        WebElement element = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
        System.out.println(element.getTagName());

        Thread.sleep(3000);
        driver.close();
    }
}
