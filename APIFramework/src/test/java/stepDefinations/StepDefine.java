package stepDefinations;

import POJO.Location;
import POJO.addPlace;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.junit.Assert.assertEquals;

public class StepDefine extends utils {
    RequestSpecification response;
    ResponseSpecification res_spec;
    Response res;
    static String place_id;

    TestDataBuild data=new TestDataBuild();

    @Given("Add Place Payload with {string} {string} {string}")
    public void add_place_payload_with(String name, String language, String address) throws IOException {
        // Write code here that turns the phrase above into concrete actions



        response=given().spec(requestSpecification()).body(data.addPlacePayload(name, language, address));
    }
    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String method){
        // Write code here that turns the phrase above into concrete actions
        //Constructor will be called with value of resource
        APIResources resourceAPI= APIResources.valueOf(resource);
        System.out.println(resourceAPI.getResource());
        res_spec= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        if(method.equalsIgnoreCase("POST")) {
            res = response.when().post(resourceAPI.getResource());
            // .then().spec(res_spec).extract().response();
        } else if (method.equalsIgnoreCase("GET")) {
            res = response.when().get(resourceAPI.getResource());
        }

    }
    @Then("the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

        assertEquals(res.getStatusCode(),200);
    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String Expectedvalue) {
        // Write code here that turns the phrase above into concrete actions

        assertEquals(getJsonPath(res,key),Expectedvalue);

    }
    @Then("verify place_Id created maps to {string} using {string}")
    public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        place_id=getJsonPath(res,"place_id");
        response=given().spec(requestSpecification()).queryParam("place_id",place_id);
        user_calls_with_http_request(resource,"GET");
        String actualname=getJsonPath(res,"name");
        assertEquals(actualname,expectedName);
    }

    @Given("Delete Place Payload")
    public void delete_place_payload() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        response=given().spec(requestSpecification()).body(data.deletePlacePayload(place_id));
    }

}
