package ir.restassured.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class APITest {

    @Test
    public void testGetRequest() {
        given()
                .when()
                .get("https://api.restful-api.dev/objects")
                .then()
                .statusCode(200);
    }

    @Test
    public void testJSONKeyHasValue() {
        given()
                .when()
                .get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then()
                .body("id", hasItem("3"));
    }
/*
    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {
        get("/events?id=390")
                .then()
                .statusCode(200)
                .assertThat()
                .body("data.leagueId", equalTo(35));
    }*/
}