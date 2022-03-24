package starter.healtyfit.StepDefintion.Food;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Food.CreateFoodStep;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AddFoodStefDef {

    @Steps
    CreateFoodStep createFoodStep;

    @When("Admin input data namefood {string} and calories {int} and energy {int} and carbohidrate {double} and protein {double} and  unit {string} and unit value {int} and food categories {string}")
    public void adminInputDataNamefoodAndCaloriesAndEnergyAndCarbohidrateAndProteinAndUnitAndUnitValueAndFoodCategories(String nameFood, int calories, int energy, double carbohidrate, double protein, String unit, int unitValue, String foodCategories) {
        createFoodStep.inputDataFood(nameFood,calories,energy,carbohidrate,protein,unit,unitValue,foodCategories);
    }


    @Then("New food succes created")
    public void newFoodSuccesCreated() {
        restAssuredThat(response ->response.statusCode(201));

    }

}
