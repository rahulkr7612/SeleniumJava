package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("Total Links"+links.size());

        int noofbrokenlink=0;
        for(WebElement link:links)
        {
            String href=link.getAttribute("href");
            if(href==null || href.isEmpty()) {
                System.out.println("Not Psooisble");
                continue;
            }

            try {
                //Hit URL to the server
                URL linkurl = new URL(href);//Converted href value from String to URL
                HttpURLConnection connectlink = (HttpURLConnection) linkurl.openConnection();//Open connection to the server
                connectlink.connect();
                if (connectlink.getResponseCode() >= 400) {
                    System.out.println(href+"=====Broken Link");
                    noofbrokenlink++;
                }
                else
                    System.out.println(href+"======Not a Broken Link");

            } catch (Exception e) {

            }
        }
        System.out.println("No of Broken Link"+noofbrokenlink);

    }
}
