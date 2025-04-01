package TestNGDependency;

import org.testng.annotations.Test;

public class GroupingPayment {

    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void PaymentinRupee()
    {
        System.out.println("This is Payment in Rupee");
    }
    @Test(priority = 2,groups = {"sanity","regression","functional"})
    void PaymentinDollar()
    {
        System.out.println("This is Payment in Dollar");
    }

}
