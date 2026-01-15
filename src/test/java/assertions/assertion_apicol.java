package assertions;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class assertion_apicol {
    public static void assertStatus200 (Response response){
        response.then().statusCode(200);
    }
    public static void assertJson(Response response) {
        response.then().contentType("application/json");
    }
    public static void assertContentBody(Response response, String label_name , Object content_label){
        response.then().body(label_name,equalTo(content_label));
    }
    public static void assertContentBodyArray(Response response, String label_name , Object content_label){
        response.then().body(label_name,hasItem(content_label));
    }


}
