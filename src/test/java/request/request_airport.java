package request;

import endpoint.endPoint_apiCol;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class request_airport {

    public static Response getAirportIdColombia(Object airportId){
        return given()
                .log().all()
                .when()
                .get(endPoint_apiCol.airport_general+"/"+airportId);

    }
}
