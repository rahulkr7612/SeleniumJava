package TestNGUdemy;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {

    @BeforeMethod
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
    @AfterMethod
    void logout()
    {
        System.out.println("This is Logout--");
    }
}
