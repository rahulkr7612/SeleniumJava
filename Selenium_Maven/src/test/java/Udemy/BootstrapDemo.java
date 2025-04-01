package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        //Select single option
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();//opes drop down options
        //Select single option
        //driver.findElement(By.xpath("//input[@value='Java']")).click();

        //Print all options
        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println(options.size());

        //Print all option
        for(WebElement ob:options)
        {
            System.out.println(ob.getText());
        }

        //Select Multiple options
        for(WebElement ob:options)
        {
            if(ob.getText().equals("Java") || ob.getText().equals("Python") || ob.getText().equals("MySQL"))
            {
                ob.click();
            }
        }


    }

}
