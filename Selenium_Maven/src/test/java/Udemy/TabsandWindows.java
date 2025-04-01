package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabsandWindows {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.switchTo().newWindow(WindowType.TAB);//open new tab
        driver.switchTo().newWindow(WindowType.WINDOW);//open new Window
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
}
