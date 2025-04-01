package Udemy;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshots {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //1) Full Page Screenshot
/*        TakesScreenshot ts= (TakesScreenshot) driver;
        File sourcefile=ts.getScreenshotAs(OutputType.FILE);
        File targetFile=new File("C:\\Users\\rahuls10\\Downloads\\Full.png");
        sourcefile.renameTo(targetFile);*/

        //2) Capture Screenshot from specific section
        /*WebElement featuredProduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcefile=featuredProduct.getScreenshotAs(OutputType.FILE);
        File targetFile=new File("C:\\Users\\rahuls10\\Downloads\\Specific.png");
        sourcefile.renameTo(targetFile);*/

        //3) Capture the screenshot of web element
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourceFile=logo.getScreenshotAs(OutputType.FILE);
        File targetFile=new File("C:\\Users\\rahuls10\\Downloads\\Element.png");
        sourceFile.renameTo(targetFile);



    }
}
