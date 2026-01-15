package request;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import endpoint.endPoint_apiCol;

public class request_country {
    public static Response getCountryColombia(){
        return given()
                    .log().all()
                .when()
                    .get(endPoint_apiCol.countryColombia);

    }
}
