package TestNGDependency;

import org.testng.annotations.Test;

public class GrouplingLoginTest {

    @Test(priority = 1,groups = {"sanity"})
    void loginByEmail()
    {
        System.out.println("This is Login by Email");
    }
    @Test(priority = 2,groups = {"sanity"})
    void loginByFaceBook()
    {
        System.out.println("This is Login by Facebook");
    }
    @Test(priority = 3,groups = {"sanity"})
    void loginBytwitter()
    {
        System.out.println("This is Login by Twitter");
    }
}
