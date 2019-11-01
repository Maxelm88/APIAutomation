package testcases;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.*;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class tc_003 {

    @Test
    public void tc_003(){
       given().contentType(ContentType.JSON)
                .body("{\"id\": 4,\"title\": \"Spiderman\", \"author\": \"ABC\"}")
                .when().post("http://localhost:3000/posts")
               .then().statusCode(201).contentType(ContentType.JSON);

    }
}
