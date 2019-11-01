package testcases;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

public class TC_002_get {

    @Test
    public void tc_002(){
        given().param("text", "Spiderman")
                .when().get("http://md5.jsontest.com/")
                .then().statusCode(200);
    }
}
