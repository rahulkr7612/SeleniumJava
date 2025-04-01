package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.webTestCase;
import util.genericutil;

public class loginPage extends webTestCase {

    @FindBy(xpath = "//input[@data-id='inputUsername']")
    WebElement useridTextBox;

    @FindBy(xpath = "//input[@data-id='inputPassword']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()=' Login']")
    WebElement LoginElement;

    public loginPage(){
        PageFactory.initElements(driver,this);
    }

    public void login(String userName, String password){
        genericutil.sendTextinElement(useridTextBox,userName);
        genericutil.sendTextinElement(passwordTextBox,password);
        genericutil.waitElementUntilClickable(LoginElement);
    }
}






