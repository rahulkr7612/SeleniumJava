package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePopUp {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Syntax : https://username:Password@the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();

    }
}
