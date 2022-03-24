package starter.healtyfit.StepDefintion.User;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.User.LoginHealtyfitStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginHealtyFitStepDef {

    @Steps
    LoginHealtyfitStep loginHealtyfitStep;


    @When("User input email {string} and input password {string}")
    public void userInputEmailAndInputPassword(String email, String password) {
        loginHealtyfitStep.inputDataUser(email,password);
    }

    @Then("User succes log in")
    public void userSuccesLogIn() {
        restAssuredThat(response ->response.statusCode(200));
    }

    @When("User input invalid email {string} and input password {string}")
    public void userInputInvalidEmailAndInputPassword(String invalidEmail, String validPassword) {
        loginHealtyfitStep.inputInvalidEmail(invalidEmail, validPassword);
    }


    @Then("User fail log in")
    public void userFailLogIn() {
        restAssuredThat(response ->response.statusCode((400)));

    }

    @When("User skip input data")
    public void userSkipInputData() {
    }

    @When("User input valid email {string} and invalid {string}")
    public void userInputValidEmailAndInvalid(String validEmail, String invalidPassword) {
        loginHealtyfitStep.inputInvalidPassword(validEmail,invalidPassword);
    }


    @When("Admin input email {string} and input password {string}")
    public void adminInputEmailAndInputPassword(String validAdminEmail, String validAdminPassword) {
        loginHealtyfitStep.inputValidAdminData(validAdminEmail,validAdminPassword);
    }

    @Then("Admin succes log in")
    public void adminSuccesLogIn() {
        restAssuredThat(response ->response.statusCode(200));
    }
}
