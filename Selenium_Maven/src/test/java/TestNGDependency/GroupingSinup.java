package TestNGDependency;

import org.testng.annotations.Test;

public class GroupingSinup {

    @Test(priority = 1,groups = {"regression"})
    void signupbyEmail()
    {
        System.out.println("This is signup by Email");
    }
    @Test(priority = 2,groups = {"regression"})
    void signupByFaceBook()
    {
        System.out.println("This is signup by Facebook");
    }
    @Test(priority = 3,groups = {"regression"})
    void lsignupByFaceBook()
    {
        System.out.println("This is signup by Facebook");
    }
}
