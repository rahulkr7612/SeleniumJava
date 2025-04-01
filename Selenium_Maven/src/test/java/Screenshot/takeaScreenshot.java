package Screenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class takeaScreenshot {
    public static void main(String[] args) throws IOException {
        /*ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");*/
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");*/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.redbus.in/");
        driver.get("https://www.redbus.in/");
        //TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File file =((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("C:\\Users\\rahuls10\\OneDrive - AMDOCS\\Backup Folders\\Documents\\IMG_20230421_151656.png"));
        driver.close();

    }
}
