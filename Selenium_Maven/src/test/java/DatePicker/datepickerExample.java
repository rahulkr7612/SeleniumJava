package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class datepickerExample {
    public static void main(String[] args) throws InterruptedException {
        /*ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");*/
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");*/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.redbus.in/");
        driver.get("https://www.redbus.in/");
        WebElement srcElement= driver.findElement(By.xpath("//input[@id='src']"));
        srcElement.sendKeys("Pune");
        List<WebElement> allElement=driver.findElements(By.xpath("(//div[@class='sc-gqjmRU giWxzf'])[1]//following::text[@class='placeHolderMainText']"));
        for(WebElement e : allElement){
            System.out.println(e.getText());
        }
            /*if(e.getText().equalsIgnoreCase("pune")){
                e.click();
                break;
            }*/
        /*}
        WebElement destElement= driver.findElement(By.xpath("//div[@class='sc-bdVaJa ckpqdK']//div[@class='sc-ifAKCX kPhbmx']"));
        destElement.sendKeys("Swargate");
        List<WebElement> allElement2=driver.findElements(By.xpath("//div[@id='homeV2-root']//li"));
        for(WebElement e : allElement2){
            if(e.getText().equalsIgnoreCase("swargate")){
                e.click();
                break;
            }
        }*/
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }
}
