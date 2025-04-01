package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSVGElement {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

    }
}
