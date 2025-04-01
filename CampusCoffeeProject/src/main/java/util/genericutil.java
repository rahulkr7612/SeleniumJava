package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.webTestCase;

import java.time.Duration;

public class genericutil extends webTestCase {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICIT_WAIT =20;
    public static final long EXPLICIT_WAIT =20;
    public static WebDriverWait webdriverwait;

    public static void waitElementUntilClickable(WebElement element){
        webdriverwait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        webdriverwait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public static void sendTextinElement(WebElement element , String setText){
        element.sendKeys(setText);
    }


}
