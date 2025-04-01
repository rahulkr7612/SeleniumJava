import POJOClass.api;
import POJOClass.getCourse;
import POJOClass.webAutomation;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class OauthTest {

    public static void main(String[] args) {

        String[] courseTitles={"Selenium Webdriver Java","Cypress","Protractor"};

        String response=given().formParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .formParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
                .formParam("grant_type","client_credentials")
                .formParam("scope","trust")
                .when().log().all()
                .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
        System.out.println(response);

        JsonPath js = new JsonPath(response);
        String token=js.getString("access_token");

/*        String actualResponse=given()
                .queryParam("access_token",token)
                .when().log().all().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").asString();*///This worked

        getCourse gc=given()
                .queryParam("access_token",token)
                .when().log().all().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(getCourse.class);

        //System.out.println(actualResponse);

        System.out.println(gc.getLinkedIn());
        System.out.println(gc.getInstructor());
        System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());

        List<api> apiCourse = gc.getCourses().getApi();
        for(int i=0;i<apiCourse.size();i++)
        {
            if(apiCourse.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
            {
                System.out.println(apiCourse.get(i).getPrice());
            }

        }
        //Get Course Name of Web Automation
        ArrayList<String> ar=new ArrayList<String>();

        List<webAutomation> wc=gc.getCourses().getWebAutomation();
        for(int j=0;j<wc.size();j++)
        {
            ar.add(wc.get(j).getCourseTitle());

        }
        List<String> expectedList= Arrays.asList(courseTitles);
        Assert.assertTrue(ar.equals(expectedList));

     }
}
