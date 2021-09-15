import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import methods.Methods;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utils.PropReader;

import java.lang.reflect.Method;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {

    Methods methods;

    public StepImplementation() {
        methods = new Methods();
    }

    @Step("Log test")
    public void createLog() {
        methods.seePropValue("token");
    }

    @Step("GET the endpoint:<endpoint> check if status code is <statusCode> and the json scheme matches with the file <jsonScheme>")
    public void getRequestTest(String endpoint, int statusCode, String jsonScheme){
        methods.getRequest(endpoint,statusCode,jsonScheme);
    }

    @Step("GET the endpoint:<endpoint> with query parameters: <parameter1>,<parameter2>,<parameter3>,<parameter4> and values: <value1>,<value2>,<value3>,<value4>  check if status code is <statusCode> and the json scheme matches with the file <jsonScheme>")
    public void getRequestTest(String endpoint,String param1,String param2,String param3,String param4,String value1,String value2,String value3,String value4, int statusCode, String jsonScheme){
        methods.getRequestWithQuery(endpoint,param1,param2,param3,param4,value1,value2,value3,value4,statusCode,jsonScheme);
    }

}