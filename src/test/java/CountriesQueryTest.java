import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

public class CountriesQueryTest extends Constantes {

    @Test
    public void verificarNulo() {
        given().
                        header("Content-Type", "application/json").
                        body(URL_BASE_NULL).
                when().
                         post(METHOD_POST).
                then().
                         assertThat().
                         statusCode(200).log().body().
                          body("data.country.code", anyOf(nullValue(),empty()));

    }

    @Test
    public void countriesAndStats() {
        given().
                         header("Content-Type", "application/json").
                         body(URL_BASE).
                when().
                         post(METHOD_POST).
                then().
                         assertThat().
                         statusCode(200).log().body();
    }
    @Test
    public void VerificarOStatusE400() {
        given().
                        header("Content-Type", "application/json").
                        body(URL_ERRADA).
                when().
                        post(METHOD_POST).
                then().
                        assertThat().
                        statusCode(400).log().body().
                        body("head.title",response -> equalTo("Error"));

    }

}
