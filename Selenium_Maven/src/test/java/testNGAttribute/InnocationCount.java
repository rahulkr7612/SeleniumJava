package testNGAttribute;

import org.testng.annotations.Test;

public class InnocationCount {
    @Test(invocationCount = 6000, invocationTimeOut = 1)
    public void testCase4()
    {
        System.out.println("Test Case 4");
    }
}
