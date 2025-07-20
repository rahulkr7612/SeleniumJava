package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{

    @Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class,groups = {"sanity","Regression","Master"})//since data provider class is in different package
    public void verify_LoginDDT(String email,String pwd,String exp)
    {
        logger.info("_______Startin Test TC003------");
        try {
            HomePage hp = new HomePage(driver);
            hp.clickMyAccount();
            hp.clickLogin();


            LoginPage lp = new LoginPage(driver);
            lp.setEmail(email);
            lp.setPassword(pwd);
            lp.clickLogin();

            //My AccountPage
            MyAccountPage macc = new MyAccountPage(driver);
            Boolean targetPage = macc.isMyAccountPageExists();

            if (exp.equalsIgnoreCase("valid")) {
                if (targetPage == true) {
                    Assert.assertTrue(true);
                    macc.clickLogout();
                } else {
                    Assert.assertTrue(false);
                }
            }

            if (exp.equalsIgnoreCase("invalid")) {
                if (targetPage == true) {

                    macc.clickLogout();
                    Assert.assertTrue(false);
                } else {
                    Assert.assertTrue(true);
                }
            }
        } catch (Exception e) {
            Assert.fail();
        }
        logger.info("_______Finsished Test TC003------");

    }
}
