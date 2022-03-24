package starter.healtyfit.StepDefintion.User;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.User.UpdateUserNameStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateUserName {

    @Steps
    UpdateUserNameStep updateUserNameStep;

    @When("User change name from testing to {string}")
    public void userChangeNameFromUsertwoTo(String updateName) {
        updateUserNameStep.putUserName2(updateName);
    }

    @Then("Succes update name")
    public void succesUpdateName() {
        restAssuredThat(response ->response.statusCode(200));

    }
}
