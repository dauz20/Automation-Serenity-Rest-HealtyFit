package starter.healtyfit.step.Food;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class CreateFoodStep {

    public String URLFood = "https://aaryadewangga.cloud.okteto.net/foods";
    public String tokenAdminAmigos = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc5MTkzODMsInJvbGVzIjp0cnVlLCJ1c2VyX3VpZCI6IllQVFBlbnNaRURkajR6RWhYcmlCcE4ifQ.loksAb4EnDyLQ5JdYJ8vtN0PL4CiJqkmC88IJDoxZ0Y";


    @Step
    public void inputDataFood(String nameFood, int calories, int energy, double carbohidrate, double protein, String unit, int unitValue, String foodCategories) {
        JSONObject dataFood = new JSONObject();
        dataFood.put("name",nameFood);
        dataFood.put("calories",calories);
        dataFood.put("energy",energy);
        dataFood.put("carbohidrate",carbohidrate);
        dataFood.put("protein",protein);
        dataFood.put("unit",unit);
        dataFood.put("unit_value",unitValue);
        dataFood.put("food_categories",foodCategories);


        SerenityRest.given()
                .header("Authorization","Bearer "+tokenAdminAmigos)
                .contentType(ContentType.JSON)
                .body(dataFood.toString())
                .log().all()
                .when()
                .post(URLFood);
    }
}
