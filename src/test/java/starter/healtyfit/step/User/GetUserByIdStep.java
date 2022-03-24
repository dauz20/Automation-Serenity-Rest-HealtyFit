package starter.healtyfit.step.User;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetUserByIdStep {

    public String URLGetUserByID = "https://aaryadewangga.cloud.okteto.net/users";
    public String userToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMDIyNTUsInJvbGVzIjpmYWxzZSwidXNlcl91aWQiOiJkQ0o5Z3Z4S0g2RFVYbmpMV1hneGpIIn0.GA26NpuCOtJ666zp4VLGMfXCWMqNpRj6M4GHsNRZIWQ";

    @Step
    public void getUserById() {

        SerenityRest.given()
                .header("Authorization","Bearer"+ userToken)
                .when()
                .get(URLGetUserByID);



    }

}
