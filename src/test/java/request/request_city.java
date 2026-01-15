package request;

import endpoint.endPoint_apiCol;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class request_city {
    public static Response getCityColombia(){
        return given()
                .log().all()
                .when()
                .get(endPoint_apiCol.city_general);

    }
}
