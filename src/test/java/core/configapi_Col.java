package core;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.BeforeAll;


public class configapi_Col {
    @BeforeAll
        public static void setup(){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://api-colombia.com/")
                .setBasePath("api/v1/")
                .setContentType("application/Json")
                .addHeader("Accept","appication/Json")
                .build();

        }
}
