package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {

    static void selectMonthandyear(WebDriver driver,String month,String year)
    {
     //Select Month and Year
        while(true)
        {
            String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if(currentMonth.equals(month) && currentYear.equals(year))
            {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
    }

    static void selectDate(WebDriver driver,String date)
    {
        //Select the Date
        List<WebElement> alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for(WebElement dt:alldates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //Switch to Frame
        driver.switchTo().frame(0);
        //1 Using send Keys
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025");
        String year="2026";
        String month="April";
        String date="10";


        //2 Using Date Picker
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        selectMonthandyear(driver,month,year);
        selectDate(driver,date);

    }
}
