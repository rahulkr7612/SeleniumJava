package stepDefinations;


import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeScenario() throws IOException {
        //Write a code that will give you place id
        //execute this code only when place id is null

        StepDefine m=new StepDefine();
        if(StepDefine.place_id ==null) {
            m.add_place_payload_with("Sharma", "Latin", "Brazil");
            m.user_calls_with_http_request("AddPlaceAPI", "POST");
            m.verify_place_id_created_maps_to_using("Sharma", "getPlaceAPI");
        }


    }



}
