package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

import java.time.Duration;

public class TC001_AccountRegistrationTest extends BaseClass{

    @Test(groups = {"Regression","Master"})
    public void verify_account_registration()
    {

            logger.info("-----Starting Test Case Registration-----");
        try {
            HomePage hp = new HomePage(driver);//Constructor will be called
            hp.clickMyAccount();
            logger.info("-----Click on My Account-----");
            hp.clickRegister();
            logger.info("-----Click on Register-----");

            AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
            logger.info("-----Provide Customer Details-----");
            regpage.setFirstName(randomString().toUpperCase());
            regpage.setLastName(randomString().toUpperCase());
            regpage.setEmail(randomString() + "@gmail.com");
            regpage.setTelephone(randomNumber());
            String password = randomAlphaNumeric();
            regpage.setPassword(password);
            regpage.setConfirmPassword(password);
            regpage.setPrivacyPolicy();
            regpage.clickContinue();

            logger.info("-----Validating Expected Message-----");
            String confmsg = regpage.getConfirmationMsg();
            if(confmsg.equals("Your Account Has Been Created!"))
            {
                Assert.assertTrue(true);
            }
            else {
                logger.error("----Test Failed-----");
                logger.debug("----Debug Logs-----");
                Assert.assertTrue(false);

            }
            //Assert.assertEquals(confmsg, "Your Account Has Been Created!!!");
        } catch (Exception e) {

            Assert.fail();

        }
        logger.info("-----Completed-----");
    }


}
