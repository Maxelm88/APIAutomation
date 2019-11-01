package testcases;

import com.jayway.restassured.http.ContentType;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class TC_007_delete {

    @Test
    public void tc_007() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .delete("http://localhost:3000/posts/7")
                .then()
                .statusCode(200);
    }
}
