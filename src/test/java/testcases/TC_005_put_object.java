package testcases;

import com.jayway.restassured.http.ContentType;
import common.CreatePost;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class TC_005_put_object {

    @Test
    public void  tc_005(){

        int i=6;
        CreatePost cpost = new CreatePost();
        cpost.setId(i);
        cpost.setTitle("Spiderman");
        cpost.setAuthor("Update author");

        given()
                .contentType(ContentType.JSON)
                .body(cpost)
                .put("http://localhost:3000/posts/" + i)
                .then()
                .statusCode(200);
    }
}
