package test;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import core.baseconfigapi_col;
import request.request_country;
import request.request_region;
import request.request_city;
import request.request_airport;
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
        assertion_apicol.assertJson(response);
        assertion_apicol.assertStatus200(response);
        assertion_apicol.assertContentBodyArray(response,"name","Orinoquía");
        response.body().prettyPrint();
    }
    @Test
    public void test_regionOneColombia(){
        String id_region = "2";
        Response response = request_region.getRegionColombia(id_region);
        assertion_apicol.assertJson(response);
        assertion_apicol.assertStatus200(response);
        assertion_apicol.assertContentBody(response,"departmentId","Pacífico");
        response.body().prettyPrint();
    }
    @Test
    public void test_cityAllColombia(){
        String id_region = "2";
        Response response = request_city.getCityColombia();
        assertion_apicol.assertJson(response);
        assertion_apicol.assertStatus200(response);
        assertion_apicol.assertContentBodyArray(response,"name","Mesetas");
        response.body().prettyPrint();

    }
    @Test
    public void test_airportOneColombia(){
        Object id_airport = 23;
        Response response = request_airport.getAirportIdColombia(id_airport);
        assertion_apicol.assertJson(response);
        assertion_apicol.assertStatus200(response);
        assertion_apicol.assertContentBody(response,"department.population",1629181);
        assertion_apicol.assertContentBody(response,"city.population",148000);
        assertion_apicol.assertContentBody(response,"id",23);
        response.body().prettyPrint();

    }


}
