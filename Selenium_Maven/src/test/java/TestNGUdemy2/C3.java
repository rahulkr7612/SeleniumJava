package TestNGUdemy2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

    @Test
    void pqr()
    {
        System.out.println("This is pqr from C3");
    }
    @AfterSuite
    void as()
    {
        System.out.println("This is After Suite");
    }
    @BeforeSuite
    void bs()
    {
        System.out.println("This is Before Suite");
    }
}
