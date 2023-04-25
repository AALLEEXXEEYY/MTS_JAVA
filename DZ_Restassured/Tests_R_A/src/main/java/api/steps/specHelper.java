package api.steps;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class specHelper {
    private final static String URL = "https://reqres.in";

    public static RequestSpecification getRequestSpec(){

        return new RequestSpecBuilder()
                .setBaseUri(URL)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }
    public static ResponseSpecification getResponseSpec(int httpStatus){
        return new ResponseSpecBuilder()
                .expectStatusCode(httpStatus)
                .log(LogDetail.ALL)
                .build();

    }
}
