package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class beforeSuite {
    @BeforeSuite
    public void beforeSuiteEx()
    {
        System.out.println("Before Suite EX");
    }
    @AfterSuite
    public void afterSuiteEx()
    {
        System.out.println("After Suite EX");
    }
}
