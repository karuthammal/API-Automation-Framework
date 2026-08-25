package api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetuserByIdTest {

    @Test
    public void getUserByIdTest() {

        int userId = 2;

        given()
            .pathParam("id", userId)

        .when()
            .get("https://reqres.in/api/users/{id}")

        .then()
            .statusCode(200)
            .body("data.id", equalTo(userId));
    }
}