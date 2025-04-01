package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class staticTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1 Find total number of rows in a table
        int rowcount= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

        //int rows = driver.findElements(By.tagName("tr")).size();
        //System.out.println(rows);

        //2 Find total number of columns
        int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        //int columns=driver.findElements(By.tagName("th")).size();
        System.out.println("No of Columns"+columns);

        //3 Read data from specific row and column
        String bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
        System.out.println(bookname);

        //4 Read data from all the rows and column
        /*for(int r=2;r<=rowcount;r++)
        {
            for(int c=1;c<=columns;c++)
            {
                String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
                System.out.print(value+"\t");
            }
            System.out.println();
        }*/

        //5 Read data name whose author is mukesh
        /*for(int r=2;r<=rowcount;r++)
        {
            String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
            if(authorName.equals("Mukesh")) {

                String BookName= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
                System.out.println(BookName+"\t"+authorName);
            }

        }*/
        int total=0;
        for(int r=2;r<=rowcount;r++)
        {
            String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();

            total=total+Integer.parseInt(price);

        }
        System.out.println(total);



    }
}
