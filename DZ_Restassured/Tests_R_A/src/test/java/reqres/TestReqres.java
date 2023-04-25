package reqres;
import api.models.*;
import api.steps.ReqresSteps;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static io.restassured.RestAssured.given;

public class TestReqres {

//    private final static String URL = "https://reqres.in/api/";

    private final ReqresSteps reqresSteps =new ReqresSteps();
    @ParameterizedTest
    @ValueSource(strings = {"2"})
    public void successGetUser(String id) {
        UsersReport respons = reqresSteps.GETUser(id);
        reqresSteps.checkEmailSuccess(respons);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2"})
    public void unsuccessGetUser(String id) {
        UsersReport respons = reqresSteps.GETUser(id);
        reqresSteps.checkFirstnameUnsuccess(respons);
    }

    @Test
    public void successRegisterUser() {
        RegisterSuccess register = new RegisterSuccess("eve.holt@reqres.in", "pistol");

        Response response = reqresSteps.POSTRegisterSuccess(register);

        reqresSteps.checkRegisterUserSuccess(response);
    }

    @Test
    public void unsuccessRegisterUser() {
        RegisterUnsuccess registerunsuccess = new RegisterUnsuccess("qwerty@miss");

        Response response = reqresSteps.POSTRegisterUnsuccess(registerunsuccess);

        reqresSteps.checkRegisterUserUnsuccess(response);
    }

    @Test
    public void successUpdateUser() {
        UpdateSuccess update = new UpdateSuccess("morpheus", "zion resident");

        Response response = reqresSteps.PUTUpdateSuccess(update, 200);

        reqresSteps.checkUpdateUserSuccess(update,response);
    }

    @Test
    public void unsuccessUpdateUser() {
        UpdateUnsuccess updateunsuccess = new UpdateUnsuccess("Спанчбоб", "повар", "russian");

        Response response = reqresSteps.PUTUpdateUnsuccess(updateunsuccess, 400);

    }

    @Test
    public void successDeleteUser() {
        Response response = reqresSteps.DELETEUserSuccess(204);
    }

    @Test
    public void unsuccessDeleteUser() {
        Response response = reqresSteps.DELETEUserUnsuccess(400);
    }


}
