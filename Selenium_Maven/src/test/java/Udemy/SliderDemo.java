package Udemy;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);

        WebElement minimum= driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println(minimum.getLocation());//Location of minimum slider
        System.out.println(minimum.getLocation().getX());//Returns only x axis
        System.out.println(minimum.getLocation().getY());//Returns only x axis

        act.dragAndDropBy(minimum,100,232).perform();  //used for slider
        System.out.println("After Moving"+minimum.getLocation());

        //Max Slider
        WebElement maximum=  driver.findElement(By.xpath("//span[2]"));
        System.out.println(maximum.getLocation());//Location of minimum slider
        act.dragAndDropBy(maximum,-76,232).perform();  //used for slider
        System.out.println("After Moving"+maximum.getLocation());
    }
}
