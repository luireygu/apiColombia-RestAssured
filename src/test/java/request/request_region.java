package request;

import endpoint.endPoint_apiCol;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class request_region {
    public static Response getRegionColombia(){
        return given()
                .log().all()
                .when()
                .get(endPoint_apiCol.region_general);

    }
}
