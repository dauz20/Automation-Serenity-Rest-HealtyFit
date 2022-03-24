package starter.healtyfit.StepDefintion.Goal;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Goal.GetAllGoalStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllGoalStefDef {

    @Steps
    GetAllGoalStep getAllGoalStep;

    @When("User request to get all goal")
    public void userRequestToGetAllGoal() {
        getAllGoalStep.fetchAllGoal();
    }

    @Then("The system send all goal user")
    public void theSystemSendAllGoalUser() {
        restAssuredThat(response ->response.statusCode(200));
    }


}
