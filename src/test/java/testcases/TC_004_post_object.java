package testcases;

import com.jayway.restassured.http.ContentType;
import common.CreatePost;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class TC_004_post_object {

    @Test
    public void tc_004() {
        CreatePost cpost = new CreatePost();
        cpost.setId(7);
        cpost.setTitle("ABCD");
        cpost.setAuthor("Author 1");

        given()
                .contentType(ContentType.JSON)
                .body(cpost)
                .when()
                .post("http://localhost:3000/posts")
                .then()
                .contentType(ContentType.JSON)
                .statusCode(201);
    }
}
