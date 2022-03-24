package starter.healtyfit.step.User;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class UpdateUserNameStep {

    public String URLUpdateUser= "https://aaryadewangga.cloud.okteto.net/users";
    public String tokenUserNameTesting = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMDQ5OTUsInJvbGVzIjpmYWxzZSwidXNlcl91aWQiOiJrSjZlOVJyQ3JWSnVtWUNSU2RobVlQIn0.-7WYioNE_VAItjze_UOW3AgsEY-Rr1cnuz3mymFgBo4";

    @Step
    public void putUserName1(String name) {
        JSONObject dataName = new JSONObject();
        dataName.put("name",name);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(dataName.toString())
                .log().all()
                .when()
                .put(URLUpdateUser)
                .getHeader(tokenUserNameTesting);
    }

    @Step
    public void putUserName2(String name) {
        JSONObject dataName2 = new JSONObject();
        dataName2.put("name",name);

        SerenityRest.given()
                .header("Authorization","Bearer "+tokenUserNameTesting)
                .contentType(ContentType.JSON)
                .body(dataName2.toString())
                .log().all()
                .when()
                .put(URLUpdateUser);
    }

}
