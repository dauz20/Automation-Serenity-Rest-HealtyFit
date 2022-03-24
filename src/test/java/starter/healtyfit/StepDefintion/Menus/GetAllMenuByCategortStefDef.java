package starter.healtyfit.StepDefintion.Menus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Menus.GetAllMenuByCategory;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllMenuByCategortStefDef {

    @Steps
    GetAllMenuByCategory getAllMenuByCategory;

    @When("User request get all menu by category {string}")
    public void userRequestGetAllMenuByCategory(String category) {
        getAllMenuByCategory.fetchMenuByCategory(category);

    }

    @Then("The system send all menu category dinner")
    public void theSystemSendAllMenuCategoryDinner() {
        restAssuredThat(response ->response.statusCode(200));
    }
}
