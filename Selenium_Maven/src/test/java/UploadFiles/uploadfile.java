package UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uploadfile {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement element = driver.findElement(By.id("file-upload"));
        WebElement upload = driver.findElement(By.id("file-submit"));
        element.sendKeys("C:\\Users\\rahuls10\\OneDrive - AMDOCS\\Backup Folders\\Documents\\MCQ Notes.txt");
        upload.click();
        WebElement filesuccess = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if (filesuccess.isDisplayed()){
            System.out.println("Success");
        }else{
            System.out.println("Failed");
        }
        driver.close();
    }
}
