package api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetUsersQueryTest {

    @Test
    public void getUsersWithQueryParamTest() {

        given()
            .queryParam("page", 2)

        .when()
            .get("https://reqres.in/api/users")

        .then()
            .statusCode(200)
            .body("page", equalTo(2))
            .body("data.size()", greaterThan(0));
    }
}