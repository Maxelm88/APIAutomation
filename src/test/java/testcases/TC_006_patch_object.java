package testcases;

import com.jayway.restassured.http.ContentType;
import common.CreatePost;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class TC_006_patch_object {

    @Test
    public void tc_006(){
        CreatePost cpost = new CreatePost();

        cpost.setAuthor("patch author");
        given()
                .body(cpost)
                .when()
                .contentType(ContentType.JSON)
                .patch("http://localhost:3000/posts/7")
                .then()
                .statusCode(200);
    }
}
