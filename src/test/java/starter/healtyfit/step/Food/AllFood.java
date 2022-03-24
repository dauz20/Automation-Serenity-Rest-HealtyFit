package starter.healtyfit.step.Food;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AllFood {

    private static String URL="https://aaryadewangga.cloud.okteto.net/foods";

    @Step
    public void fetchAllFood(){
        SerenityRest.given()
                .get(URL);

    }
}
