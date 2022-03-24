package starter.healtyfit.StepDefintion.User;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.User.GetUserByIdStep;
import starter.healtyfit.utility.UserDetailResponse;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserByIdStefDef {

    @Steps
    GetUserByIdStep getUserByIdStep;


    @When("get user by id usertwo")
    public void iSearchingUserById() {
        getUserByIdStep.getUserById();
    }


    @Then("The system send profil data {string}")
    public void theSystemSendData(String userNameById) {
        restAssuredThat(response ->response.statusCode(400));
        restAssuredThat(response ->response.body(UserDetailResponse.userNameTest,equalTo(userNameById)));
    }
}
