package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.webTestCase;
import util.genericutil;

public class homePage extends webTestCase{
    @FindBy(xpath = "//img[@alt='user avatar']")
    WebElement loginButton;//Declaration of web element


    @FindBy(xpath = "//body[@id=\"main\"]")
    WebElement cookies;//Declaration of web element

    public homePage(){
        PageFactory.initElements(driver,this);//Initalization of web element
    }//Constructor


    public void clickAcceptCookies(){
        genericutil.waitElementUntilClickable(cookies);
    }
    public void clickLogin(){
        genericutil.waitElementUntilClickable(loginButton);
    }



}
