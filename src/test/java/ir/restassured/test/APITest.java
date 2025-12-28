package ir.restassured.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest {

    @Test
    public void testGetRequest() {
        given()
                .when()
                .get("https://api.restful-api.dev/objects")
                .then()
                .statusCode(200);
    }
}