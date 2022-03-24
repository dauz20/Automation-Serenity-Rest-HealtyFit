package starter.healtyfit.step.Food;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class UpdateFoodStep {

    public String URLUpdateFood = "https://aaryadewangga.cloud.okteto.net/foods/AdDhLnXE6W2fWUAw7fijdT";
    public String tokenAdminAmigos = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc5MTkzODMsInJvbGVzIjp0cnVlLCJ1c2VyX3VpZCI6IllQVFBlbnNaRURkajR6RWhYcmlCcE4ifQ.loksAb4EnDyLQ5JdYJ8vtN0PL4CiJqkmC88IJDoxZ0Y";

//    @Step
//    public void fetchFoodById(String foodID){
//        SerenityRest.given()
//                .pathParam("food_uid",foodID)
//                .get(URLUpdateFood);
//    }


    @Step
    public void putProtein(double protein) {
        JSONObject dataProtein= new JSONObject();
        dataProtein.put("protein",protein);

        SerenityRest.given()
                .header("Authorization","Bearer "+ tokenAdminAmigos)
                .contentType(ContentType.JSON)
                .body(dataProtein.toString())
                .log().all()
                .when()
                .put(URLUpdateFood);
    }

}
