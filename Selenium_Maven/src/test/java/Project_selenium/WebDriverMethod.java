package Project_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethod {
    public static void main(String[] args) throws InterruptedException {
       ChromeOptions chromeoptions=new ChromeOptions();
       chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
       System.setProperty("webdriver.chrome.driver","C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
       WebDriver driver  = new ChromeDriver(chromeoptions);
       driver.get("https://www.amazon.in/");
       String url=driver.getCurrentUrl();
       System.out.println(url);

        String title=driver.getTitle();
        System.out.println(title);
        String source =driver.getPageSource();
        System.out.println(source);
       Thread.sleep(3000);
       driver.close();
    }


}
