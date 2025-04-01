package cookiesdemo;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class addcookie {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\rahuls10\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuls10\\Downloads\\chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Cookie cookie=new Cookie("company","Rahul");
        driver.manage().addCookie(cookie);
        Set<Cookie> allcookies=driver.manage().getCookies();
        for(Cookie c:allcookies) {
            System.out.println(c);
        }
        System.out.println("----------");
        //System.out.println(driver.manage().getCookieNamed("company"));*/
        //driver.manage().deleteCookieNamed("company");
        driver.manage().deleteAllCookies();
        Set<Cookie> allcookies2=driver.manage().getCookies();
        for(Cookie c:allcookies2) {
            System.out.println(c);
        }

        driver.close();
    }
}
