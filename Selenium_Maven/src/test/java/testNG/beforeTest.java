package testNG;

import org.testng.annotations.*;

public class beforeTest extends beforeSuite{

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

    @BeforeTest
    public void beforeTestEx(){
        System.out.println("Before Test Example");
    }

    @AfterTest
    public void afterTestEx(){
        System.out.println("After Test Example");
    }

    @Test
    public void testinMethod(){
        System.out.println("Testing Method");
    }
    @Test
    public void testinMethod2(){
        System.out.println("Testing Method2");
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
