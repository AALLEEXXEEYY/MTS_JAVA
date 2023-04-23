package api.steps;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import api.models.*;
import api.models.UsersReport;
import static io.restassured.RestAssured.given;

public class ReqresSteps {
    public static UsersReport GETUser(String id) {

        return given()
                .spec(specHelper.getRequestSpec())
                .when()
                .get(String.format("/api/users/%s", id))
                .then()
                .spec(specHelper.getResponseSpec(200))
                .extract().body().jsonPath().getObject(".", UsersReport.class);
    }

    public void checkEmailSuccess(UsersReport response) {

        String mail = "janet.weaver@reqres.in";

        Assertions.assertEquals(mail,response.getData().getEmail());
    }

    public void checkFirstnameUnsuccess(UsersReport response) {
        String firstname = "https://reqres.in/img/faces/2-image.jpg";

        Assertions.assertEquals(firstname,response.getData().getFirstName());
    }

    public static Response POSTRegisterSuccess(RegisterSuccess register) {

        return given()
                .spec(specHelper.getRequestSpec())
                .when()
                .body(register)
                .post("/api/register")
                .then()
                .spec(specHelper.getResponseSpec(200))
                .extract()
                .response();
    }

    public void checkRegisterUserSuccess(Response response) {

        Integer expectedSuccess1 = 4;

        String expectedSuccess2 = "QpwL5tke4Pnpja7X4";

        Assertions.assertEquals(expectedSuccess1, response.jsonPath().get("id"));

        Assertions.assertEquals(expectedSuccess2,response.jsonPath().get("token"));
    }

    public static Response POSTRegisterUnsuccess(RegisterUnsuccess registerunsuccess) {

        return given()
                .spec(specHelper.getRequestSpec())
                .when()
                .body(registerunsuccess)
                .post("/api/register")
                .then()
                .spec(specHelper.getResponseSpec(400))
                .extract()
                .response();
    }

    public void checkRegisterUserUnsuccess(Response response) {
        String expectedUnsuccess = "Missing password";

        Assertions.assertEquals(expectedUnsuccess, response.jsonPath().get("error"));
    }

    public static Response PUTUpdateSuccess(UpdateSuccess update, int httpstatus) {

        return given()
                .spec(specHelper.getRequestSpec())
                .when()
                .body(update)
                .put("/api/users/2")
                .then()
                .spec(specHelper.getResponseSpec(httpstatus))
                .extract()
                .response();
    }
    public void checkUpdateUserSuccess(UpdateSuccess updates, Response response) {

        Assertions.assertEquals(updates.getName(), response.jsonPath().get("name"));

        Assertions.assertEquals(updates.getJob(), response.jsonPath().get("job"));

        Assertions.assertNotNull(response.jsonPath().get("updatedAt"));
    }

    public static Response PUTUpdateUnsuccess(UpdateUnsuccess updateunsuccess, int httpstatus) {

        return given()
                .spec(specHelper.getRequestSpec())
                .when()
                .body(updateunsuccess)
                .put("/api/users/gfhgbn")
                .then()
                .spec(specHelper.getResponseSpec(httpstatus))
                .extract()
                .response();
    }

    public static Response DELETEUserSuccess(int httpstatus) {

        return given()
                .spec(specHelper.getRequestSpec())
                .when()
                .body("")
                .delete("/api/users/2")
                .then()
                .spec(specHelper.getResponseSpec(httpstatus))
                .extract()
                .response();
    }

    public static Response DELETEUserUnsuccess(int httpstatus) {

        return given()
                .spec(specHelper.getRequestSpec())
                .when()
                .body("")
                .delete("/api/users/мамваимваиавиваиааваави")
                .then()
                .spec(specHelper.getResponseSpec(httpstatus))
                .extract()
                .response();
    }

}