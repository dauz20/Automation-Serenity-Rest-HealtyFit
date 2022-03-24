package starter.healtyfit.StepDefintion.Food;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Food.SearchingFoodStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class SearchingFoodStefDef {

    @Steps
    SearchingFoodStep searchingFoodStep;

    @When("I look up food {string} by category {string} in searching field")
    public void iLookUpFoodInSearchingField(String nameFood, String category) {
        searchingFoodStep.fetchDataByCategoryFood(nameFood,category);
    }

    @Then("The System give data Apel")
    public void theSystemGiveDataApel() {
        restAssuredThat(response ->response.statusCode(200));

    }
}
