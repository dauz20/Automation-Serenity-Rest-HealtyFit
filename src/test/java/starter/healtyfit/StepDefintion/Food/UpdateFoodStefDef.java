package starter.healtyfit.StepDefintion.Food;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Food.UpdateFoodStep;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateFoodStefDef {

    @Steps
    UpdateFoodStep updateFoodStep;


    @And("Admin change protein data salmon paggang to {int}")
    public void adminChangeProteinDataSalmonPaggangTo(double proteinData) {
        updateFoodStep.putProtein(proteinData);
    }

    @Then("Succes update protein food")
    public void succesUpdateProteinFood() {
        restAssuredThat(response ->response.statusCode(201));

    }

}
