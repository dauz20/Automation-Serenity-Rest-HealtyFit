package starter.healtyfit.StepDefintion.Menus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Menus.DataMenuStep;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateMenuStefDef {

    @Steps
    DataMenuStep dataMenuStep;

    
    @When("Admin input menu category {string} and  food ikan salmon panggang id {string} dan food id apel {string}")
    public void adminInputMenuCategoryAndFoodIkanSalmonPanggangIdDanFoodIdApel(String category, String foodId1, String fooId2) {
        dataMenuStep.dataMenu(category,foodId1,fooId2);
    }

    @Then("The menu created")
    public void theMenuCreated() {
        restAssuredThat(response ->response.statusCode(201));

    }

    @When("Admin input menu category {string} and  food almon id {string} dan food id Bajigur {string}")
    public void adminInputMenuCategoryAndFoodAlmonIdDanFoodIdBajigur(String category, String foodId3, String foodId4) {
        dataMenuStep.dataMenu(category,foodId3,foodId4);
    }
}
