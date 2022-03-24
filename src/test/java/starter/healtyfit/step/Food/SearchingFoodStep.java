package starter.healtyfit.step.Food;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class SearchingFoodStep {

    public String URLSearchingFood = "https://aaryadewangga.cloud.okteto.net/foods/search?input={input}&category={category}";


    @Step
    public void fetchDataByCategoryFood(String inputFood, String category){
        SerenityRest.given()
                .pathParam("input",inputFood)
                .pathParam("category",category)
                .get(URLSearchingFood);
    }





}
