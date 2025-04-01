package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //Single File upload
        /*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\rahuls10\\Downloads\\Day-37.txt");
        if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("Day-37.txt"))
            System.out.println("Success");
        else
            System.out.println("Failed");*/

        //Multiple File upload
        String File1="C:\\Users\\rahuls10\\Downloads\\Day-37.txt";
        String File2="C:\\Users\\rahuls10\\Downloads\\Day-36.txt";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(File1+"\n"+File2);
        int nooffiles=driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();

        if(nooffiles==2)
            System.out.println("Uploaded");
        else
            System.out.println("Not uolodaed");


    }
}
