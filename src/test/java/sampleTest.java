import io.restassured.http.ContentType;
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

    @Test
    public void shouldCreateUser(){
        //Arrange
        //Act
        //Assert
        given()
            .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer 7ccd399ac8b7e4a6eca70af7725f91acbe0d58e3271a91c7795a3e22ad2f8310\n")
                .body("{\n" +
                        "    \"id\": 3957,\n" +
                        "    \"name\": \"kishan Desai\",\n" +
                        "    \"email\": \"kishan@rao.info\",\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"status\": \"active\"\n" +
                        "}")
                .when()
                    .post("https://gorest.co.in/public/v2/users")
                .then()
                    .log().body()
                    .statusCode(201);

    }
}