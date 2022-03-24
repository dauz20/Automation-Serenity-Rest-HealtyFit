package starter.healtyfit.step.Food;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class FoodId {
    public static String URLSerachingFood ="https://aaryadewangga.cloud.okteto.net/foods/{foodId}";

    @Step
    public void fetchFoodById(String foodId) {
        SerenityRest.given()
                .pathParam("foodId", foodId)
                .get(URLSerachingFood);
    }
}
