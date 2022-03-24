package starter.healtyfit.StepDefintion.Food;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Food.AllFood;
import starter.healtyfit.utility.FoodDetailResponse;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllFoodStepDef {

    @Steps
    AllFood allFood;

    @When("I request to get all foods")
    public void iRequestToGetAllFoods() {
        allFood.fetchAllFood();
    }

    @Then("The system send message {string}")
    public void theSystemSendMessage(String message) {
        restAssuredThat(response ->response.statusCode(200));
        restAssuredThat(response ->response.body(FoodDetailResponse.messageSucces,equalTo(message)));
    }

    @And("The first food name is {string}")
    public void theFirstFoodNameIs(String nameFood) {
        restAssuredThat(response ->response.body(FoodDetailResponse.firstFood,equalTo(nameFood)));

    }
}
