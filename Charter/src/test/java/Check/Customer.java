package Check;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Customer {

    public String Create_Customer(String token)
    {
        RestAssured.baseURI = "http://illnqw8622:11111/";
        int custguid = (int) (Math.random() * 100000);
        int authguid = (int) (Math.random() * 100);
        String CustomerResponse=given().log().all().queryParam("lo","en_US").header("Content-Type", "application/json").header("Authorization",token).body("{\n" +
                "  \"CreateCustomerRequest\": {\n" +
                "    \"ownedByOrganization\": false,\n" +
                "    \"customerType\": \"R\",\n" +
                "    \"customerSubtype\": \"BETA\",\n" +
                "    \"authGUIDX9\": \""+authguid+"\",\n" +
                "    \"legacyBillingAccountNumberX9\": \"12345\",\n" +
                "    \"sourceApplicationIndicatorX9\": \"M\",\n" +
                "    \"individual\": {\n" +
                "      \"firstName\": \"Roo\",\n" +
                "      \"lastName\": \"Erys\",\n" +
                "      \"phone\": \"10078\",\n" +
                "      \"email\": \"test010@gmail.com\",\n" +
                "      \"fax\": \"852147\",\n" +
                "      \"middleName\": \"AutoREST\",\n" +
                "      \"preferredContactMethod\": \"Phone\",\n" +
                "      \"dateOfBirth\": \"\",\n" +
                "      \"preferredName\": \"preferredName\",\n" +
                "        \"preferredPronounsX9\":\"wrw\",\n" +
                "      \"salutation\": \"Mr.\",\n" +
                "      \"emailPreferencesX9\": \"mail010@gmail.com\",\n" +
                "      \"smsPreferencesX9\": \"852147\",\n" +
                "      \"custGuidX9\": \""+custguid+"\",\n" +
                "      \"ssnX9\": \"5466\",\n" +
                "      \"issuerTypeX9\": \"LOCAL\",\n" +
                "      \"issuerNameX9\": \"Max\"\n" +
                "    },\n" +
                "    \"primaryAddress\": {\n" +
                "      \"address1\": \"Adam 011\",\n" +
                "      \"address2\": \"Tzafrir 011\",\n" +
                "      \"city\": \"ChicagoP\",\n" +
                "      \"state\": \"PA\",\n" +
                "      \"postalCode\": \"969618\",\n" +
                "      \"country\": \"US\",\n" +
                "      \"geoCodeX9\": \"391013000\",\n" +
                "      \"zip4X9\": \"2210\",\n" +
                "      \"locationIdX9\": \"2210\",\n" +
                "      \"marketIdX9\": \"12121\"\n" +
                "    },\n" +
                "    \"billingAddress\": null\n" +
                "  }\n" +
                "}").when().post("rp-webapp-9-common/customer/customer").then().log().all().assertThat().statusCode(200).extract().response().asString();
        JsonPath js=new JsonPath(CustomerResponse);
        String cid= js.get("CreateCustomerResponse.ID");
        return cid;
    }
}
