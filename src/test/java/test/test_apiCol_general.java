package test;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import core.baseconfigapi_col;
import request.request_country;
import request.request_region;
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
    @Test
    public void test_regionAllColombia(){
        Response response = request_region.getRegionColombia();
        response.body().prettyPrint();
        assertion_apicol.assertJson(response);
        assertion_apicol.assertStatus200(response);
        assertion_apicol.assertContentBodyArray(response,"name","Orinoquía");
    }
}
