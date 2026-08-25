package api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class UpdateUserApiTest {

    @Test
    public void updateUserTest() {

        String requestBody = "{"
                   + "\"name\": \"Karuthammal Updated\","
                   + "\"job\": \"Senior QA Tester\""
                   + "}";
              

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .put("https://reqres.in/api/users/2")

        .then()
            .statusCode(200)
            .body("name", equalTo("Karuthammal Updated"))
            .body("job", equalTo("Senior QA Tester"));
    }
}