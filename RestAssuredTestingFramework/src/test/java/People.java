import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class People {

        @Test
        public void testGetUsers() {

            RestAssured.baseURI = "https://reqres.in/api";
            String body = RestAssured.given()
                    .when().get("/users")
                    .then()

                        .extract().body().asString();
            System.out.println(body);
        }
}
