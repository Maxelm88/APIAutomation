package testcases;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

public class TC_008_get_json_data {

    @Test
    public void tc_008() {

//        Response response = when().get("http://localhost:3000/posts/6");
//        System.out.println(response.asString());


        //jedno sprawdzenie
//       String actualnAuthor = when().get("http://localhost:3000/posts/6")
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .path("author");
//        Assert.assertEquals(actualnAuthor, "Update author");


        //wiele sprawdzen
       ValidatableResponse response = when()
                .get("http://localhost:3000/posts/6")
                .then()
                .contentType(ContentType.JSON);

       String actualTitle = response.extract().path("title");
       String actualAuthor = response.extract().path("author");
       int actualId = response.extract().path("id");

       Assert.assertEquals(actualId, 6);
       Assert.assertEquals(actualTitle, "Spiderman");

    }
}
