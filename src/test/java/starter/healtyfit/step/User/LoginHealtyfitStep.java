package starter.healtyfit.step.User;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class LoginHealtyfitStep {

    public String URLLogin="https://aaryadewangga.cloud.okteto.net/users/login";
    public String URLLoginAdmin = "https://aaryadewangga.cloud.okteto.net/admin/login";

    @Step
    public void inputDataUser(String email, String password) {
        JSONObject loginData = new JSONObject();
        loginData.put("email",email);
        loginData.put("password",password);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(loginData.toString())
                .log().all()
                .when()
                .post(URLLogin);

    }

    @Step
    public void inputInvalidEmail(String invalidEmail, String validPassword){
        JSONObject loginData = new JSONObject();
        loginData.put("email",invalidEmail);
        loginData.put("password",validPassword);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(loginData.toString())
                .log().all()
                .when()
                .post(URLLogin);

    }

    @Step
    public void inputInvalidPassword(String validEmail, String invalidPassword){
        JSONObject loginData = new JSONObject();
        loginData.put("email",validEmail);
        loginData.put("password",invalidPassword);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(loginData.toString())
                .log().all()
                .when()
                .post(URLLogin);

    }

    @Step
    public void inputValidAdminData(String validAdminEmail, String validAdminPassword){
        JSONObject loginData = new JSONObject();
        loginData.put("email",validAdminEmail);
        loginData.put("password",validAdminPassword);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(loginData.toString())
                .log().all()
                .when()
                .post(URLLoginAdmin);

    }




}
