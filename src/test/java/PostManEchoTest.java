import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class PostManEchoTest {
    @Test
    public void shouldPostManEchoResponseRaw() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Динозавры — вымершие позвоночные животные, правившие на Земле около 160 миллионов лет до нашей эры.")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Динозавры — вымершие позвоночные животные, правившие на Земле около 160 миллионов лет до нашей эры."));


    }


    }
}
