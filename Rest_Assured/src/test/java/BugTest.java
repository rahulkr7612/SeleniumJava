import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.File;

import static io.restassured.RestAssured.given;

public class BugTest {

    public static void main(String[] args) {



        RestAssured.baseURI="https://rahulsharma22031998.atlassian.net/";

        String createIssueResponse=given()
                .header("Content-Type","application/json")
                .header("Authorization","Basic cmFodWxzaGFybWEyMjAzMTk5OEBnbWFpbC5jb206QVRBVFQzeEZmR0YwUVNhZ3J5WExVWUFsUkhaZGp6cUJLUDRIZGh2QjJPWDNiUjllNWtsazY1X25xLTlWX29mcEFrUElHZ0VmcC13ZExBUHdzR3JQTDhpampLaVZIZm9oVFBsVG1aT2pXanF3STVyMTE2QnR4TnRhRm5OSUc1dDNpM3h2N0pxYTBrV2liWU90UGtfVzhJenljR3UtV3FHWnFaNHgyYnZ3NFJiUEt0QmVIeF8wVlhZPThERkY4MEFC")
                .body("{\n" +
                        "    \"fields\": {\n" +
                        "       \"project\":\n" +
                        "       {\n" +
                        "          \"key\": \"SCRUM\"\n" +
                        "       },\n" +
                        "       \"summary\": \"REST ye merry gentlemen.\",\n" +
                        "       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\n" +
                        "       \"issuetype\": {\n" +
                        "          \"name\": \"Bug\"\n" +
                        "       }\n" +
                        "   }\n" +
                        "}\n")
                .log().all()
                .post("rest/api/2/issue").then().log().all().assertThat().statusCode(201)
                .extract().response().asString();
        JsonPath js=new JsonPath(createIssueResponse);
        String issue_id=js.getString("id");
        System.out.println(issue_id);

        //Add Attachment
        given()
                .pathParam("key",issue_id)//Path Parameter
                .header("Authorization","Basic cmFodWxzaGFybWEyMjAzMTk5OEBnbWFpbC5jb206QVRBVFQzeEZmR0YwUVNhZ3J5WExVWUFsUkhaZGp6cUJLUDRIZGh2QjJPWDNiUjllNWtsazY1X25xLTlWX29mcEFrUElHZ0VmcC13ZExBUHdzR3JQTDhpampLaVZIZm9oVFBsVG1aT2pXanF3STVyMTE2QnR4TnRhRm5OSUc1dDNpM3h2N0pxYTBrV2liWU90UGtfVzhJenljR3UtV3FHWnFaNHgyYnZ3NFJiUEt0QmVIeF8wVlhZPThERkY4MEFC")
                .header("X-Atlassian-Token","no-check")
                .multiPart("file",new File("C:\\Users\\rahuls10\\OneDrive - AMDOCS\\Backup Folders\\Documents\\Rest Assured.docx")).log().all()
                .post("/rest/api/3/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);



    }
}
