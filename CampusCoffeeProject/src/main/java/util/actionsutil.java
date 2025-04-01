package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testBase.webTestCase;

public class actionsutil extends webTestCase {

    public static Actions actions;

    public void elementtodraganddrop(WebElement srcElement,WebElement descElement){
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement,descElement);
        actions.perform();

    }
    public void movetoElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

    }

}
