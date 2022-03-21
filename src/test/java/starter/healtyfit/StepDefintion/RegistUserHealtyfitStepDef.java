package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.RegisterHealtyFitStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class RegistUserHealtyfitStepDef {

    @Steps
    RegisterHealtyFitStep registerHealtyFitStep;

    @When("User input data")
    public void userInputData() {
        registerHealtyFitStep.inputData();

    }

    @Then("New account user created")
    public void newAccountUserCreated() {
        restAssuredThat(response ->response.statusCode(201));
        restAssuredThat(response ->response.body("'data'.'name'",equalTo("Clark")));
    }
}
