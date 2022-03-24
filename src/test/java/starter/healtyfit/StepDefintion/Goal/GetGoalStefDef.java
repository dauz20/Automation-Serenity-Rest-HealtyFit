package starter.healtyfit.StepDefintion.Goal;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Goal.GetGoalStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetGoalStefDef {

    @Steps
    GetGoalStep getGoalStep;

    @When("User request get goal id {string}")
    public void userRequestGetGoal(String goalID) {
        getGoalStep.fetchDataGoal(goalID);
    }

    @Then("The system send data goal")
    public void theSystemSendDataGoal() {
        restAssuredThat(response ->response.statusCode(200));
    }
}
