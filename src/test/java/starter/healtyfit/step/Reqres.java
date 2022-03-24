package starter.healtyfit.step;


import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class Reqres {


    public String URLCreate="https://reqres.in/api/users";
    @Step
    public void PostNewUser(String name, String job){


        JSONObject data = new JSONObject();
        data.put("name",name);
        data.put("job", job);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLCreate);
    }
}
