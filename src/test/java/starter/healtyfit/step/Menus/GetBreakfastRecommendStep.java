package starter.healtyfit.step.Menus;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetBreakfastRecommendStep {

    private static String URLBreakfastRecommend = "https://aaryadewangga.cloud.okteto.net/menus/recommend/breakfast";
    private static String tokenUserone = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgwOTE2MjgsInJvbGVzIjpmYWxzZSwidXNlcl91aWQiOiJ0RFJaVzJFcFhaWGpmVDNCbk5URFhlIn0.Vdvgdsg8wMtlWDg0_HxRkTVi-uznoXVGplFCX9f6z7g";

    @Step
    public void fetchBreakfastRecommend() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenUserone)
                .get(URLBreakfastRecommend);
    }

}
