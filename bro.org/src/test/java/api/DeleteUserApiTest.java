package api;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteUserApiTest {

    @Test
    public void deleteUserTest() {

        given()

        .when()
            .delete("https://reqres.in/api/users/2")

        .then()
            .statusCode(204);
    }
}