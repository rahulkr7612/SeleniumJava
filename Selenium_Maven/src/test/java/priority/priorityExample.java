package priority;

import org.testng.annotations.*;

public class priorityExample {
    @Test(priority = 1)
    public void testCase4()
    {
        System.out.println("Test Case 4");
    }
    @Test(priority = 2 , groups = {"smoke"})
    public void testCase2()
    {
        System.out.println("Test Case 2");
    }
    @Test(priority = 3)
    public void testCase1()
    {
        System.out.println("Test Case 1");
    }
    @Test(priority = 4)
    public void testCase3()
    {
        System.out.println("Test Case 3");
    }
}
