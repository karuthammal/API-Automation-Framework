package api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class HeaderTest {

    @Test
    public void headerTest() {

        given()
            .header("Accept", "application/json")

        .when()
            .get("https://reqres.in/api/users?page=2")

        .then()
            .statusCode(200)
            .body("page", equalTo(2));
    }
}