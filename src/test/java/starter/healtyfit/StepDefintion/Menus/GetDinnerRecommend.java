package starter.healtyfit.StepDefintion.Menus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Menus.GetMenuCategoryRecommendStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDinnerRecommend {

    @Steps
    GetMenuCategoryRecommendStep getDinnerRecommendStep;

    @When("user request get {string} recommend")
    public void userRequestGetDinnerRecommend(String menuCategory) {
        getDinnerRecommendStep.fetchmenuCategoryRecommend(menuCategory);
    }

    @Then("The System send menu dinner recommend")
    public void theSystemSendMenuDinnerRecommend() {
        restAssuredThat(response ->response.statusCode(200));
    }
}
