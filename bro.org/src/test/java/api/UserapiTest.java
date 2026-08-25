package api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class UserapiTest{
	@Test
	public void getUserTest() {
		given()
        .when()
        .get("https://reqres.in/api/users?page=2")
        .then()
        .statusCode(200)
        .body("data.size()", greaterThan(0));
		

	
	}
}