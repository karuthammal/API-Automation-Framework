package api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class RequestBodyTest {

    @Test
    public void requestBodyTest() {

        String requestBody = "{"
                + "\"name\":\"Karuthammal\","
                + "\"job\":\"QA Tester\""
                + "}";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .post("https://reqres.in/api/users")

        .then()
            .statusCode(201)
            .body("name", equalTo("Karuthammal"))
            .body("job", equalTo("QA Tester"));
    }
}