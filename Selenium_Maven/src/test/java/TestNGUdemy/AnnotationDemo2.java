package TestNGUdemy;

import org.testng.annotations.*;

public class AnnotationDemo2 {

    @BeforeClass
    void login()
    {
        System.out.println("This is Login---");
    }
    @Test(priority = 1)
    void search()
    {
        System.out.println("This is search");
    }
    @Test(priority = 2)
    void advanceSearch()
    {
        System.out.println("This is advance Search");
    }
    @AfterClass
    void logout()
    {
        System.out.println("This is Logout--");
    }
}
