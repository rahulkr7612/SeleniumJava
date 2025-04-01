package testNG;

import org.testng.annotations.*;

public class beforeandAfterMethodDemo {

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }
    @Test
    public void testCase1()
    {
        System.out.println("Test Case 1");
    }
    @Test(groups = {"smoke"})
    public void testCase2()
    {
        System.out.println("Test Case 2");
    }
    @Test
    public void testCase3()
    {
        System.out.println("Test Case 4");
    }
    @Test(groups = {"smoke"})
    public void testCase4()
    {
        System.out.println("Test Case 4");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }
}
