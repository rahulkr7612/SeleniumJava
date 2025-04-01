import Files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DynamicJson {

    @Test(dataProvider = "BooksData")
    public void addBook(String isbn,String isle)
    {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        String response=given().header("Content-Type","application/json").
                body(payload.AddBook(isbn,isle)).
                when().post("/Library/Addbook.php").
                then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        JsonPath js=reusableMethods.rawtojson(response);
        String id=js.get("ID");
        System.out.println(id);
    }
    @DataProvider(name="BooksData") //Sending Parameter to Test annotataion
    public Object[][] getData()
    {
        return new Object[][] {{"ofcd","4345"},{"yufi","4655"},{"wqer","4367"},};
    }
}
