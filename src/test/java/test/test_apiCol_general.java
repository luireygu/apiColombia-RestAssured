package test;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import core.baseconfigapi_col;
import request.request_country;
import assertions.assertion_apicol;

public class test_apiCol_general extends baseconfigapi_col{
    @Test
    public void test_countryColombia(){
        Response response = request_country.getCountryColombia();
        assertion_apicol.assertJson(response);
        assertion_apicol.assertStatus200(response);
        assertion_apicol.assertContentBody(response,"id",1);
        response.body().prettyPrint();
    }
}
