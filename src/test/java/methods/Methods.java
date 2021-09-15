package methods;

import com.github.javaparser.utils.Log;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.log4j.Logger;
import testSetup.TestSetup;
import utils.PropReader;

import javax.sound.midi.SysexMessage;
import java.io.IOException;

public class Methods {


    PropReader propReader;
    String apiKey;


    public Methods() {

        propReader = new PropReader();
        apiKey = TestSetup.apiKey;
    }

    public String seePropValue(String Statement) {
        String value = "";
        try {
            value= PropReader.readPropertiesFile().getProperty(Statement);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    public void getRequest(String endpoint, int expectedStatus, String responseJsonScheme){

        RestAssured
                .given()
                    .log().all()
                    .baseUri(TestSetup.baseUrl)
                    .queryParam("token",apiKey)
                    .contentType(ContentType.JSON)
                .when()
                    .get(endpoint)
                .then()
                    .assertThat()
                    .statusCode(expectedStatus)
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(responseJsonScheme));
    }
    public void getRequestWithQuery(String endpoint,String param1,String param2,String param3,String param4,String value1,String value2,String value3,String value4,int expectedStatus, String responseJsonScheme){

        RestAssured
                .given()
                .   log().all()
                    .baseUri(TestSetup.baseUrl)
                    .queryParam("token",apiKey)
                    .queryParam(param1,value1)
                    .queryParam(param2,value2)
                    .queryParam(param3,value3)
                    .queryParam(param4,value4)
                    .contentType(ContentType.JSON)
                .when()
                    .get(endpoint)
                .then()
                    .assertThat()
                    .statusCode(expectedStatus)
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(responseJsonScheme));
    }
}