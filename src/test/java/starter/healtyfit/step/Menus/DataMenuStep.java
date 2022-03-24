package starter.healtyfit.step.Menus;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;

public class DataMenuStep {

    public String URLCreateMenu = "https://aaryadewangga.cloud.okteto.net/menus";
    public String tokenAdminAmigos = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgxMDg4MjIsInJvbGVzIjp0cnVlLCJ1c2VyX3VpZCI6IllQVFBlbnNaRURkajR6RWhYcmlCcE4ifQ.Y2GKZs9MSqNm8IqhRzoZdKXVqOk8lTtlrO2Su-ZMV8k";

    @Step
    public void dataMenu(String menuCategory, String setFoodid1, String setFoodid2) {

        JSONArray food_uid = new JSONArray();
        food_uid.put(new JSONObject().put("food_uid", setFoodid1));
        food_uid.put(new JSONObject().put("food_uid", setFoodid2));

        JSONObject dataMenu = new JSONObject();
        dataMenu.put("menu_category", menuCategory);
        dataMenu.put("foods", food_uid);


        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenAdminAmigos)
                .contentType(ContentType.JSON)
                .body(dataMenu.toString())
                .log().all()
                .when()
                .post(URLCreateMenu);
    }

}
