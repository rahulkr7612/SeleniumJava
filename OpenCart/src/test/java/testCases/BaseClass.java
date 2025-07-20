package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BaseClass {

    public Logger logger;//Log4j
    public static WebDriver driver;
    public Properties p;

    @BeforeClass(groups = {"Regression","Master","sanity"})
    @Parameters({"os","browser"})
    public void setup(String os,String br) throws IOException {
        //Loading Properties File
        FileReader file=new FileReader("./src//main//resources//config.properties");

        p=new Properties();
        p.load(file);

        logger= LogManager.getLogger(this.getClass());

        switch (br.toLowerCase())
        {
            case "chrome": driver=new ChromeDriver();break;
            case "firefox": driver=new FirefoxDriver();break;
            case "edge": driver=new EdgeDriver();break;
            default:
                System.out.println("Invalid browser");return;//to exit code we use return if browser is not valid no need to execute ahead
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("appURL"));//Reading URL from properties file
        driver.manage().window().maximize();

    }
    @AfterClass(groups = {"sanity","Regression","Master"})
    public void tearDown()
    {
        driver.quit();
    }

    public String randomString()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(5);//RandomStringUtils is a predefined class having method randomAlphabetic from commons.lang library dependency added
        return generatedString;
    }
    public String randomNumber()
    {
        String generatedNumber= RandomStringUtils.randomNumeric(10);//Generates String format
        return generatedNumber;
    }
    public String randomAlphaNumeric()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(5);
        String generatedNumber= RandomStringUtils.randomNumeric(10);//Generates String format
        return (generatedString+"@"+generatedNumber);
    }
    public String captureScreen(String tname) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
        File targetFile=new File(targetFilePath);

        sourceFile.renameTo(targetFile);

        return targetFilePath;

    }
}
