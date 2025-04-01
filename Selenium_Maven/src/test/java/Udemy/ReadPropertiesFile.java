package Udemy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {

        Properties propobj=new Properties();


        FileInputStream file =new FileInputStream("C:\\Users\\rahuls10\\Downloads\\config.properties");
        propobj.load(file);//Load Properties File

        //Reading all data
        String url=propobj.getProperty("appurl");
        String email=propobj.getProperty("email");
        String password=propobj.getProperty("pasword");
        String orderid=propobj.getProperty("orderid");
        String customerid=propobj.getProperty("customerid");

        System.out.println(url+" "+password+" "+email+" "+orderid+" "+customerid);

        //Reading all the keys
        //Set<String> keys=propobj.stringPropertyNames();
        //System.out.println(keys);

        Set<Object> keys=propobj.keySet();
        System.out.println(keys);

        Collection<Object> value= propobj.values();
        System.out.println(value);

    }
}
