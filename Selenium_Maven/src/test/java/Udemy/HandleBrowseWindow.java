package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowseWindow {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String> windowsId= driver.getWindowHandles();

        //Approach 1 - Convert Set in List
        /*List<String> windowList =new ArrayList(windowsId);
        String parentId=windowList.get(0);
        String childId=windowList.get(1);

        //Switch to child window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        //Switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());*/

        //Apporach 2
        for(String winId:windowsId){
            String title= driver.switchTo().window(winId).getTitle();

            if(title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }
        }

    }
}
