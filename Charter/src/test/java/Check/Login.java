package Check;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Login {

    public String Login() {

        RestAssured.baseURI = "http://illnqw8622:11111/";
        Response LoginResponse=given().log().all().header("Content-Type", "application/json").body("{\n" +
                "  \"Credentials\": {\n" +
                "    \"user\": \"Asmsa1\",\n" +
                "    \"password\": \"Asmsa1\"\n" +
                "  }\n" +
                "}").when().post("rp-webapp-9-common/Login").then().log().all().assertThat().statusCode(200).extract().response();
        String token=LoginResponse.getHeader("uxfauthorization");
        return  token;
    }
}
