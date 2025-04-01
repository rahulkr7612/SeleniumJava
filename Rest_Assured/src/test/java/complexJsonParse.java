import Files.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {

    public static void main(String[] args) {

        JsonPath js=new JsonPath(payload.coursePrice());
        int count= js.getInt("courses.size()");//Count number of items in array of json
        System.out.println(count);

        //Print Purchase amount
        int totalamount=js.getInt("dashboard.purchaseAmount");
        System.out.println(totalamount);

        //Print Title of first course
        String firstCourse= js.get("courses[0].title");
        System.out.println(firstCourse);

        //Print all course title and price
        for(int i=0;i<count;i++)
        {
            String courseTitle=js.get("courses["+i+"].title");
            System.out.println(js.get("courses["+i+"].price").toString());
            System.out.println(courseTitle);
        }

        //Print No of copies sold by RPA
        System.out.println("Print No of copies sold by RPA");
        for(int i=0;i<count;i++)
        {
            String courseTitle=js.get("courses["+i+"].title");
            if(courseTitle.equalsIgnoreCase("RPA"))
            {
                int copycount=js.get("courses["+i+"].copies");
                System.out.println(copycount);
                break;
            }
        }
    }
}
