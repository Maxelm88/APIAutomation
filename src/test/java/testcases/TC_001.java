package testcases;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001 {

    @Test
    public void tc_001_getMethod_validation(){
       Response response =  RestAssured.get("http://www.omdbapi.com/?t=Spiderman&y=&plot=short&r=json");
        System.out.println(response.asString());

        System.out.println(response.getStatusCode());
//        Assert.assertEquals(response.getStatusCode(),200);

        System.out.println(response.getContentType());
    }
}
