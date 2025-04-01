package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1 Select a checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
        System.out.println("Before Selection "+checkbox.isSelected());
        checkbox.click();
        System.out.println("After Selection "+checkbox.isSelected());

        //2 Capturing all checkbox
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println(checkboxes.size());

        //3 Selecting all the checkboxes
        /*for(int i=0;i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }
*/
        //Without using Indexing : Enhanced For loop
        /*for (WebElement chkbox:checkboxes)
        {
            chkbox.click();
        }*/

        //select last 3 checkboxes
        //Total No of checkboxes-No of checkboxes u want to select =Starting Index
       /* for(int i= checkboxes.size()-3; i< checkboxes.size();i++)
        {
            checkboxes.get(i).click();
        }

        //select or unselect checkboxes
        for(WebElement chbox:checkboxes){
            if(chbox.isSelected())
            chbox.click();
            else
                chbox.click();
        }*/

        //Selecting checkbox as per Label/text

        String weekday="Sunday";
        switch (weekday)
        {
            case "Sunday" : driver.findElement(By.xpath("//input[@id='sunday']")).click();
            break;

            case "Monday" : driver.findElement(By.xpath("//input[@id='monday']")).click();
                break;
            case "Tuesday" : driver.findElement(By.xpath("//input[@id='tuesday']")).click();
                break;
            case "Wednesday" : driver.findElement(By.xpath("//input[@id='wedesday']")).click();
                break;
            case "Thursday" : driver.findElement(By.xpath("//input[@id='thursday']")).click();
                break;
            case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
                break;
            case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
                break;
            default:
                System.out.println("invalid weekday");


        }

    }
}
