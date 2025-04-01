package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleiFrameDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame1
        WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");

        driver.switchTo().defaultContent();//Go back to main page we need to get out of frame to access other frames
        //Frame 2
        WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");

        driver.switchTo().defaultContent();
        //Frame 3
        WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Programing");

        //switch to inner frame in frame 3
        driver.switchTo().frame(0);//Switched to inner Frame
        driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();

    }
}
