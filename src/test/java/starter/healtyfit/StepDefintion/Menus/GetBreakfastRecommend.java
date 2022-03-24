package starter.healtyfit.StepDefintion.Menus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.Menus.GetBreakfastRecommendStep;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetBreakfastRecommend {

    @Steps
    GetBreakfastRecommendStep getBreakfastRecommendStep;

    @When("User request get breakfast recommend")
    public void userRequestGetBreakfastRecommend() {
        getBreakfastRecommendStep.fetchBreakfastRecommend();
    }

    @Then("The system send menu breakfast recommend")
    public void theSystemSendMenuBreakfastRecommend() {
        restAssuredThat(response ->response.statusCode(200));

    }
}
