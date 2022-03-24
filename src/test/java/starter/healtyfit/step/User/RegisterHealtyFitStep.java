package starter.healtyfit.step.User;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class RegisterHealtyFitStep {

    public String URL = "https://aaryadewangga.cloud.okteto.net/users/register";

    @Step
    public void inputData(){
        JSONObject dataUser = new JSONObject();
        dataUser.put("name","Clark");
        dataUser.put("email","clarktest@mail.com");
        dataUser.put("password","Clark");
        dataUser.put("gender","Pria");

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(dataUser.toString())
                .log().all()
                .when()
                .post(URL);



    }



}
