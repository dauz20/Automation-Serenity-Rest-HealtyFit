package starter.healtyfit.step.Admin;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class RegisterAdminStep {

    public String URLCreateAdmin= "https://aaryadewangga.cloud.okteto.net/admin/register";

    @Step
    public void inputDataAdmin (String nameAdmin, String adminEmail, String adminPassword, String adminGender) {
        JSONObject dataAdmin = new JSONObject();
        dataAdmin.put("name",nameAdmin);
        dataAdmin.put("email",adminEmail);
        dataAdmin.put("password",adminPassword);
        dataAdmin.put("gender",adminGender);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(dataAdmin.toString())
                .log().all()
                .when()
                .post(URLCreateAdmin);


    }





}
