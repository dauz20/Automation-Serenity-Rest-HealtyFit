package starter.healtyfit.StepDefintion.Menus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Menus.GetAllMenuStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllMenuStefDef {

    @Steps
    GetAllMenuStep getAllMenuStep;

    @When("User request to get all menu")
    public void userRequestToGetAllMenu() {
        getAllMenuStep.fetchAllMenu();
    }

    @Then("The system send all menu")
    public void theSystemSendAllMenu() {
        restAssuredThat(response ->response.statusCode(200));

    }
}
