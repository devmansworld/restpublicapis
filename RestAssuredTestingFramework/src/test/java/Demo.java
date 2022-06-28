import static io.restassured.RestAssured.*;
import static org.junit.Test.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.HashMap.*;
import java.util.Map;

public class Demo {
    @Test
    public void testGetUsers() {

        baseURI = "https://reqres.in/api";
        String body =
                given()
                .when()
                        .get("/users")
                .then()
                        .statusCode(200)
                       .body("data[1].first_name",equalTo("Janet"))
                                .extract().body().asString();
                     //   .body("data[1].first_name", equals("Janet"));

        System.out.println("----------------------");
        System.out.println(body);
        System.out.println(body.length());

        System.out.println("----------------------");
    }

@Test
    public void insertaUsers()
    {
     baseURI = "https://reqres.in/api";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Alejandra");
        map.put("job", "Customer Success");
        given()
                .when()
                .post()
                .then()
                .statusCode(415);

        System.out.println("-----should fail to success-----------------");
    }

    @Test
    public void inyectaUsers()
    {
        baseURI = "https://reqres.in/api";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Alejandra");
        map.put("job", "Customer Success");
        given()
                .when()
                .put()
                .then()
                .statusCode(404);
    }

    @Test
    public void sacaUsers(){
        baseURI = "https://reqres.in/api";
        Map<String, Object> map = new HashMap<String, Object>();
        map.remove("name", "Alejandra");
        map.remove("job", "Customer Success");
        given()
                .when()
                .delete()
                .then()
                .statusCode(404);

        System.out.println("should not let delete ");
    }

    @Test
        public void actualizaUsers(){
            baseURI = "https://reqres.in/api";

            Map<String, Object> map = new HashMap<String, Object>();
            map.replace("name", "Jolissa");
            map.replace("job", "Customer Success");
            given()
                    .when()
                    .patch()
                    .then()
                    .statusCode(404);

        System.out.println("........wont let change names.............................");
        }

    @Test
        public void modificaUsres(){
            baseURI = "https://reqres.in/api";

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", "Alejandra");
            map.put("job", "Customer Success");
            given()
                    .when()
                    .put()
                    .then()
                    .statusCode(201);
        }
    @Test
    public void createUserTest() {
        RestAssured.baseURI = "https://reqres.in/api";

        String payload = "{}";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Tyoe", "application/json");
        Response response = httpRequest.body(payload).post("/Account/v1/User");
        int statusCode = response.getStatusCode();

        Integer isitnotthere =  200;
        given()
                .when()
                .then()
                .statusCode(404);

        assert(isitnotthere.equals(statusCode));

        System.out.println(statusCode);

        System.out.println(isitnotthere);
    }


}
/*
    public void insertaUsers()
    {
        baseURI = "https://reqres.in/api"

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Alejandra");
        map.put("job", "Customer Success");
        given()
                .when()
                .post()
                .then()
                .statusCode(201);
    }

*/























/*
*
*
*
    public class Demo2 {
        @Test
        public void testGetUsers(){

            RestAssured.baseURI = "https://reqres.in/api";
            String body = RestAssured.given()
                    .when().get("/users")
                    .then()

                    .extract().body().asString();
            System.out.println(body);
        }
        *
        *
        *   @Test
    public void testGetUsers(){
        RestAssured.baseURI = "https://reqres.in/api";
       String body = RestAssured.given()
               .when().get("/users")
               .then()
                      .statusCode(404)
               .body()
                    .extract().body().asString();
        System.out.println(body);
    }
        *
        *
        *
        * */