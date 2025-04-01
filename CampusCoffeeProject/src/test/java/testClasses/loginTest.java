package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homePage;
import pages.loginPage;
import pages.myAccountPage;
import testBase.webTestCase;

public class loginTest extends webTestCase {

    homePage HomePAGE;

    loginPage LoginPage;

    myAccountPage MyAccountPage;
    loginTest(){
        super();
    }
    @BeforeMethod
    public void preRequisite(){
        initialization();
        HomePAGE= new homePage();
        LoginPage=new loginPage();
        MyAccountPage=new myAccountPage();
    }

    @Test(description = "verify name with vaild username and valid password")
    public void verifyLoginwithvalidusernameandpassword() throws InterruptedException {
        SoftAssert softassert =new SoftAssert();

        HomePAGE.clickAcceptCookies();
        Thread.sleep(60000);
        HomePAGE.clickLogin();

        LoginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
