package handleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class withoutHandleWindow {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.id("openwindow")).click();
        String parentwindow = driver.getWindowHandle();//returns current window id
        System.out.println(parentwindow);
        Set<String> allwindow=driver.getWindowHandles();
        for(String s: allwindow)
        {
            if(!parentwindow.contains(s)){
                driver.switchTo().window(s);
                driver.findElement(By.xpath("//a[text()='BLOG']")).click();
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentwindow);

        System.out.println(driver.getTitle());

        System.out.println("-------------");
        System.out.println(allwindow);
        Thread.sleep(5000);
        driver.close();
    }
}
