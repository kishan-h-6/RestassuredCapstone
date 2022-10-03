import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class sampleTest {

    @Test
    public void shouldGetAllUsers(){
        //Arrange
        //Act
        //Assert
        given()
                .when()
                    .get("https://gorest.co.in/public/v2/users")
                .then()
                    .statusCode(200)
                    .log().body();

    }
}