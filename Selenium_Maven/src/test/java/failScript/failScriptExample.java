package failScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failScriptExample {

    @Test(retryAnalyzer = retryTestScript.class)
    public  void testMethod1(){
        System.out.print("This is test Method 1");
        Assert.assertTrue(true);
    }
    @Test(retryAnalyzer = retryTestScript.class)
    public  void testMethod2(){
        System.out.print("This is test Method 2");
        Assert.assertTrue(true);
    }
    @Test(retryAnalyzer = retryTestScript.class)
    public  void testMethod3(){
        System.out.print("This is test Method 3");
        Assert.assertTrue(false);
    }
    @Test(retryAnalyzer = retryTestScript.class)
    public  void testMethod4(){
        System.out.print("This is test Method 4");
        Assert.assertTrue(false);
    }
}
