package TestNGUdemy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

    @Test
    void Hard_Assertion()
    {
        System.out.println("Testing---");
        System.out.println("Testing---");
        Assert.assertEquals(1,2);
        System.out.println("Testing---");
        System.out.println("Testing---");
    }

    @Test
    void soft_Assertions()
    {
        System.out.println("Testing---");
        System.out.println("Testing---");
        SoftAssert sf=new SoftAssert();

        sf.assertEquals(1,2);//Soft Assert
        System.out.println("Testing---");
        System.out.println("Testing---");
        sf.assertAll();//Mandatory Step at end other TC will always pass
    }
}
