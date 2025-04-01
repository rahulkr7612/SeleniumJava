package testNGAttribute.dependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnMethod {

    @Test
    public void verifyLogin()
    {
        Assert.assertTrue(false);//will fail Method
        System.out.println("Verify Login");
    }
    @Test(dependsOnMethods = {"verifyLogin"})//only executed when verifyLogin Method is Passed
    public void fundTransfer()
    {
        System.out.println("Fund Transfer");
    }
    @Test
    public void verifyATMoption()
    {
        System.out.println("Verify ATM");
    }
}
