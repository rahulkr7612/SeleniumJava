package testNGAttribute.dependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnGroup {
    @Test(groups = {"smoke"})
    public void verifyperformdebitcardTransaction(){
        Assert.assertTrue(false);
        System.out.println("verify perform debit card Transaction");
    }
    @Test(dependsOnGroups = {"smoke"} , alwaysRun = true)
    public void verifyBook12thFailTicket(){
        System.out.println("12th Fail Ticket Booked");
    }
    @Test(enabled = false)//will not execute this method it will be disabled
    public void verifyPurchasePopCorn(){
        System.out.println("verify Purchase PopCorn");
    }
    @Test
    public void verifyPurchaseColddrink(){
        System.out.println("verify Purchase Cold Drink");
    }
}
