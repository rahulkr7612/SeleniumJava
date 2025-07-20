package stepDefinations;

import Check.Customer;
import Check.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefine {


    @Given("CustomerId")
    public void customer_id() {
        Login ck=new Login();
        String token=ck.Login();
        Customer cs=new Customer();
        String customerId= cs.Create_Customer(token);
        System.out.println(customerId);





    }

    @When("Create Order is run")
    public void create_order_is_run() {
        System.out.println("ji");
    }

    @Then("Order is Completed")
    public void order_is_completed() {
        System.out.println("ji");
    }
}
