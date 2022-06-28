import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;
public class Others {
    @Test
    public void newTest(){
        RestAssured.baseURI = "https://reqres.in/api";
    //    given().

    }
}
