package starter.postcodes.StepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.Reqres;

import static org.hamcrest.CoreMatchers.equalTo;

public class ReqresAPI {

    @Steps
    Reqres reqres;

    @When("I create new User with name is {string} and job is {string}")
    public void iCreateNewUser(String name, String job){
        reqres.PostNewUser(name, job);
    }

    @Then("New user is created")
    public void newUserIsCreated(){
        SerenityRest.then()
                .statusCode(201);

    }

    @And("New user name is {string} and job is {string}")

    public void VerifyNewUser(String name , String job){
        SerenityRest.then()
                .body("name",equalTo(name))
                .body("job",equalTo(job));
    }
}
