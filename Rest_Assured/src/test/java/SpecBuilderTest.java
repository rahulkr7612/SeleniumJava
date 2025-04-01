import POJOClass.Location;
import POJOClass.addPlace;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SpecBuilderTest {

    public static void main(String[] args) {
        RestAssured.baseURI="https://rahulshettyacademy.com";

        addPlace p=new addPlace();
        p.setAccuracy(50);
        p.setAddress("29, side layout, cohen 09");
        p.setLanguage("French-IN");
        p.setPhone_number("(+91) 983 893 3937");
        p.setWebsite("http://google.com");
        p.setName("Frontline house");
        List<String> mylist=new ArrayList<String>();
        mylist.add("shoe park");
        mylist.add("shop");
        p.setTypes(mylist);
        Location l =new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        p.setLocation(l);

        RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123")
                .setContentType(ContentType.JSON).build();

        ResponseSpecification res_spec= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        RequestSpecification response=given().spec(req).body(p);


                Response res=response.when().post("maps/api/place/add/json")
                .then().spec(res_spec).extract().response();

        String responseString= res.asString();
        System.out.println(responseString);

    }
}
