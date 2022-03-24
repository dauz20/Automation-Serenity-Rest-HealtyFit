package starter.healtyfit.step.Goal;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllGoalStep {

    private static String URLGetAllGoal = "https://aaryadewangga.cloud.okteto.net/menus";
    private static String tokenUser = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMDIyNTUsInJvbGVzIjpmYWxzZSwidXNlcl91aWQiOiJkQ0o5Z3Z4S0g2RFVYbmpMV1hneGpIIn0.GA26NpuCOtJ666zp4VLGMfXCWMqNpRj6M4GHsNRZIWQ";

    @Step
    public void fetchAllGoal() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenUser)
                .get(URLGetAllGoal);
    }
}
