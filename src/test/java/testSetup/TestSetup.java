package testSetup;

import com.thoughtworks.gauge.BeforeSuite;
import methods.Methods;

public class TestSetup {
    public static String baseUrl;
    public static String apiKey;
    Methods methods;


    public TestSetup(){
        methods = new Methods();

    }
    @BeforeSuite
    public void beforeSuite(){
        baseUrl = methods.seePropValue("baseUrl");
        apiKey = methods.seePropValue("token");
    }

}
