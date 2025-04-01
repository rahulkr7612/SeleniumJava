package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragandropdemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();


        Actions act = new Actions(driver);
        WebElement source= driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement target= driver.findElement(By.xpath("//div[@id='box106']"));

        act.dragAndDrop(source,target).perform();
    }
}
