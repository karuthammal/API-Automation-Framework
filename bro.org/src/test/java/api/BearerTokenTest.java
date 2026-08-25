package api;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BearerTokenTest {

    @Test
    public void bearerTokenTest() {

        String token = "123456789";

        given()
            .header("Authorization", "Bearer " + token)
            .header("Accept", "application/json")

        .when()
            .get("https://postman-echo.com/get")

        .then()
            .log().all()
            .statusCode(200);
    }
}
    

      