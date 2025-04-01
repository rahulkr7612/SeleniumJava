package EndtoEndECOMAPITEST;

import POJOClass.LoginRequest;
import POJOClass.LoginResponse;
import POJOClass.OrderDetails;
import POJOClass.Orders;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class EcommerceAPITest {

    public static void main(String[] args) {

        //Login
        RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build();
        LoginRequest loginrequest= new LoginRequest();
        loginrequest.setUserEmail("rahulsharma22031998@gmail.com");
        loginrequest.setUserPassword("Rahul@123");

        RequestSpecification reqLogin= given().log().all().spec(req).body(loginrequest);
        LoginResponse loginresponse= reqLogin.when().post("api/ecom/auth/login").then().log().all().extract().response().as(LoginResponse.class);

        String token=loginresponse.getToken();
        String userid=loginresponse.getUserId();

        //Add Product
        RequestSpecification addproductbasereq= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization",token).build();

        RequestSpecification reqAddProduct= given().log().all().spec(addproductbasereq).param("productName","Laptop")
                .param("productAddedBy",userid)
                .param("productCategory","Fashion")
                .param("productSubCategory","shirts")
                .param("productPrice","11500")
                .param("productDescription","Addias Originals")
                .param("productFor","women")
                .multiPart("productImage",new File("C:\\Users\\rahuls10\\Downloads\\Screenshot 2025-03-16 140244.png"));

        String addProductResponse= reqAddProduct.when().post("/api/ecom/product/add-product")
                .then().log().all().extract().asString();

        JsonPath js = new JsonPath(addProductResponse);
        String productId= js.get("productId");

        //Create Product
        RequestSpecification createOrderBasereq= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization",token).setContentType(ContentType.JSON).build();

        OrderDetails orderdetail = new OrderDetails();
        Orders order = new Orders();
        orderdetail.setCountry("India");
        orderdetail.setProductOrderedId(productId);

        List<OrderDetails> orderList= new ArrayList<OrderDetails>();
        orderList.add(orderdetail);

        order.setOrders(orderList);


        RequestSpecification createOrderReq= given().log().all().spec(createOrderBasereq).body(order);

        String responseCreateOrder=createOrderReq.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
        System.out.println(responseCreateOrder);

        //Delete
        RequestSpecification DeleteReq= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization",token).setContentType(ContentType.JSON).build();

        RequestSpecification DeleteProduct= given().log().all().spec(DeleteReq).pathParam("productId",productId);//Path Parameter
        String DeleteResponse= DeleteProduct.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all().extract().response().asString();

        JsonPath js1 = new JsonPath(DeleteResponse);
        Assert.assertEquals("Product Deleted Successfully",js1.get("message"));



    }
}
