package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass{

    @Test(groups = {"sanity","Master"})
    public void verifyLogin()
    {
        logger.info("---Start Login Test---");
        try {
            HomePage hp = new HomePage(driver);
            hp.clickMyAccount();
            hp.clickLogin();


            LoginPage lp = new LoginPage(driver);
            lp.setEmail(p.getProperty("email"));
            lp.setPassword(p.getProperty("password"));

            lp.clickLogin();

            //My AccountPage
            MyAccountPage macc = new MyAccountPage(driver);
            Boolean targetPage = macc.isMyAccountPageExists();
            Assert.assertEquals(targetPage, true, "Login Failed");

        } catch (Exception e) {
            Assert.fail();
        }
        logger.info("---Login Test Finished---");
    }

}
