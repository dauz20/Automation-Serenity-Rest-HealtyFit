package starter.healtyfit.StepDefintion.User;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.healtyfit.step.User.RegisterStep;

public class registrasiStepDefinition {

    @Steps
    RegisterStep registerStep;

    @When("klik tombol register")
    public void klik_tombol_register() {

    }
    @When("masukkan biodata")
    public void masukkan_biodata() {
        registerStep.inputNoHP();
        registerStep.inputNama();
        registerStep.inputTanggalLahir();
    }
    @When("klik save")
    public void klik_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
