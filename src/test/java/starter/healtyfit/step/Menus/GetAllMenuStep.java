package starter.healtyfit.step.Menus;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllMenuStep {

    private static String URLGetAllMenu = "https://aaryadewangga.cloud.okteto.net/menus";

    @Step
    public void fetchAllMenu() {
        SerenityRest.given()
                .get(URLGetAllMenu);
    }



}
