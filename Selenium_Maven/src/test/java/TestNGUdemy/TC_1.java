package TestNGUdemy;

import org.testng.annotations.Test;

public class TC_1 {

    @Test(priority =1)
    void openapp()
    {
        System.out.println("Open");
    }
    @Test(priority =2)
    void login()
    {
        System.out.println("Login");
    }
    @Test(priority =3)
    void logout()
    {
        System.out.println("Logout");
    }
}
