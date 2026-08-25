package api;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class NegativeApiTest {

    @Test
    public void invalidUserTest() {

        given()

        .when()
            .get("https://reqres.in/api/users/9999")

        .then()
            .statusCode(404);
    }
}