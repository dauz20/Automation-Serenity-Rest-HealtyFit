package starter.healtyfit.step.Goal;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetGoalStep {

    private static String URLGetGoal="https://aaryadewangga.cloud.okteto.net/users/goals/{goal_uid}";
    private static String tokenUserone = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMDIyNTUsInJvbGVzIjpmYWxzZSwidXNlcl91aWQiOiJkQ0o5Z3Z4S0g2RFVYbmpMV1hneGpIIn0.GA26NpuCOtJ666zp4VLGMfXCWMqNpRj6M4GHsNRZIWQ";

    @Step
    public void fetchDataGoal(String goalID){
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenUserone)
                .pathParam("goal_uid",goalID)
                .get(URLGetGoal);
    }

}
