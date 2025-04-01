import Files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basics {

    public static void main(String[] args) throws IOException {

        RestAssured.baseURI="https://rahulshettyacademy.com";

/*        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body(payload.AddPlace()).when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200).body("scope" , equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)");*///Validate body and header

        //Add Place and update place with new address --get place to validate if new address is present in the response


        /*String Response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body(payload.AddPlace()).when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope" , equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)")
                .extract().response().asString();//Extract Response , Taking  body from function*/

        //Taking body from file.json
        String Response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body(new String(Files.readAllBytes(Paths.get("C:\\Users\\rahuls10\\Downloads\\appPlace.json")))).when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope" , equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)")
                .extract().response().asString();





        System.out.println(Response);
        JsonPath js=new JsonPath(Response);//For parsing json it takes string input and returns json response
        String place= js.getString("place_id");
        System.out.println(place);

        //update Place
        String address="South Africa";
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body("{\n" +
                "\"place_id\":\""+place+"\",\n" +
                "\"address\":\""+address+"\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}").when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));

        //Get Place
        String getplaceResponse= given().log().all().queryParam("key","qaclick123")
                .queryParam("place_id",place)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().assertThat().statusCode(200).extract().response().asString();

        //JsonPath js1=new JsonPath(getplaceResponse);
        JsonPath js2= reusableMethods.rawtojson(getplaceResponse);
        String actualaddress=js2.getString("address");
        System.out.println(actualaddress);

        Assert.assertEquals(address,actualaddress);



    }
}
