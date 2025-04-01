package failScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IattonationExmCls {

    @Test
    public  void testMetho1(){
        System.out.print("This is test Method 1");
        Assert.assertTrue(true);
    }
    @Test
    public  void testMetho2(){
        System.out.print("This is test Method 2");
        Assert.assertTrue(true);
    }
    @Test
    public  void testMetho3(){
        System.out.print("This is test Method 3");
        Assert.assertTrue(false);
    }
    @Test
    public  void testMetho4(){
        System.out.print("This is test Method 4");
        Assert.assertTrue(false);
    }
}
