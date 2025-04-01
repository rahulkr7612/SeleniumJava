package Udemy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1 Normal Alert with OK
       /* driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        Alert myalert =driver.switchTo().alert();
        myalert.accept();*/

        //2 Cnfirmation Alert
        /*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert().accept();//close alert using OK
        driver.switchTo().alert().dismiss();//close alert using cancel
*/
        //3 Prompt Alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.sendKeys("welcome");
        myalert.accept();

        String res=driver.findElement(By.xpath("//p[@id='result']")).getText();
        if(res.contains("welcome")){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
