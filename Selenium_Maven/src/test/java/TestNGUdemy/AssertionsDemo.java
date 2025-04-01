package TestNGUdemy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

    @Test
    void testTitle()
    {
        String exp_Title="OpenCart";
        String act_Title="Openshop";

        //Assert.assertEquals(exp_Title,act_Title);
        if(exp_Title.equals(act_Title))
        {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test Failed");
            Assert.assertTrue(false);
        }

    }
}
