package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

public class closingSpecificWindow {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String> windowsId = driver.getWindowHandles();

        for(String winid:windowsId){
            String title=driver.switchTo().window(winid).getTitle();
            System.out.println(title);
            if(title.equals("OrangeHRM")){
                driver.close();
            }
        }
    }
}
