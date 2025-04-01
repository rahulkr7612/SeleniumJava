package resources;

import POJO.Location;
import POJO.addPlace;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public addPlace addPlacePayload(String name, String language, String address)
    {
        addPlace p=new addPlace();
        p.setAccuracy(50);
        p.setAddress(address);
        p.setLanguage(language);
        p.setPhone_number("(+91) 983 893 3937");
        p.setWebsite("http://google.com");
        p.setName(name);
        List<String> mylist=new ArrayList<String>();
        mylist.add("shoe park");
        mylist.add("shop");
        p.setTypes(mylist);
        Location l =new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        p.setLocation(l);
        return p; 
    }

    public String deletePlacePayload(String placeId)
    {
        return "{\n" +
                "  \"place_id\": \""+placeId+"\"\n" +
                "}";
    }
}
