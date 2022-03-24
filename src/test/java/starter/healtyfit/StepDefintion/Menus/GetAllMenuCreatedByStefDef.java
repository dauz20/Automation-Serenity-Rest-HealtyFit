package starter.healtyfit.StepDefintion.Menus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Menus.GetAllMenuCreatedByStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllMenuCreatedByStefDef {

    @Steps
    GetAllMenuCreatedByStep getAllMenuCreatedByStep;

    @When("I request get all menu created by {string}")
    public void iRequestGetAllMenuCreatedBy(String createdBy) {
        getAllMenuCreatedByStep.fetchAllMenuCreatedBy(createdBy);
    }

    @Then("The system send all menu created by admin")
    public void theSystemSendAllMenuCreatedByAdmin() {
        restAssuredThat(response ->response.statusCode(200));
    }
}
