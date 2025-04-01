package SeleniumDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class getAllDropdownElement {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.letskodeit.com/practice");
        WebElement dropdown=driver.findElement(By.id("carselect"));
        Select select = new Select(dropdown);
        List<WebElement> allElement=select.getOptions();
        for(WebElement element : allElement)
        {
            System.out.println(element.getText());//Get all drop down element
        }
        driver.close();
    }
}
