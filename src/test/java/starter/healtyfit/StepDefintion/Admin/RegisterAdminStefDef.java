package starter.healtyfit.StepDefintion.Admin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Admin.RegisterAdminStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class RegisterAdminStefDef {

    @Steps
    RegisterAdminStep registerAdminStep;


    @When("Admin input data name {string} and email {string} and password {string} and gender {string}")
    public void adminInputDataNameAndEmailAndPasswordAndGender(String nameAdmin, String adminEmail, String adminPassword, String adminGender) {
        registerAdminStep.inputDataAdmin(nameAdmin,adminEmail,adminPassword,adminGender);
    }

    @Then("New account admin created")
    public void newAccountAdminCreated() {
        restAssuredThat(response ->response.statusCode(201));

    }
}
