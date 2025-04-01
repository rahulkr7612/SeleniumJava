package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class selectDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement drpcountryEle= driver.findElement(By.xpath("//select[@id='country']"));
        Select drpcountry=new Select(drpcountryEle);

        //select option from dropdown
        //drpcountry.selectByVisibleText("France");
        //drpcountry.selectByValue("japan");
        drpcountry.selectByIndex(2);

        //Capture Options from Drop Down
        List<WebElement> options=drpcountry.getOptions();
        System.out.println(options.size());

        //Print the options
        for(int i=0;i<options.size();i++)
        {
            System.out.println(options.get(i).getText());
        }
    }
}
