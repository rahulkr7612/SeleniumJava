package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static util.genericutil.IMPLICIT_WAIT;
import static util.genericutil.PAGE_LOAD_TIMEOUT;

public class webTestCase {

    public Properties prop;
    public static WebDriver driver;

    public webTestCase(){
        FileInputStream fileInputStream=null;
        try {
             fileInputStream= new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
        prop=new Properties();
        try {
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public  void initialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +  "/src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "/src/main/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else{
            throw new RuntimeException("Please Select Correct Browser Name");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
    }


}
