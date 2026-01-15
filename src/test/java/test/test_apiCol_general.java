package test;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import core.baseconfigapi_col;
import request.request_country;

public class test_apiCol_general extends baseconfigapi_col{
    @Test
    public void test_countryColombia(){
        Response response = request_country.getCountryColombia();
        response.body().prettyPrint();
    }
}
