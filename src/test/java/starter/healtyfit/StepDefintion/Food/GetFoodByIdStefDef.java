package starter.healtyfit.StepDefintion.Food;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Food.FoodId;
import starter.healtyfit.utility.FoodDetailResponse;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetFoodByIdStefDef {

    @Steps
    FoodId foodId;

    @When("I searching food by Id {string}")
    public void iSearchingFoodById(String idFood) {
        foodId.fetchFoodById(idFood);
    }

    @Then("The system send food name is {string}")
    public void theSystemSendFoodNameIs(String nameFood) {
        restAssuredThat(response->response.statusCode(201));
        restAssuredThat(response-> response.body(FoodDetailResponse.nameFood,equalTo(nameFood)));
    }
}
