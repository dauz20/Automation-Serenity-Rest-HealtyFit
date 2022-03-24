package starter.healtyfit.step.Menus;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetMenuCategoryRecommendStep {

    private static String URLMenuCategoryRecommend = "https://aaryadewangga.cloud.okteto.net/menus/recommend/{menu_category}";
    private static String tokenUsertwo = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMDIyNTUsInJvbGVzIjpmYWxzZSwidXNlcl91aWQiOiJkQ0o5Z3Z4S0g2RFVYbmpMV1hneGpIIn0.GA26NpuCOtJ666zp4VLGMfXCWMqNpRj6M4GHsNRZIWQ";

    @Step
    public void fetchmenuCategoryRecommend(String menuCategory) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenUsertwo)
                .pathParam("menu_category",menuCategory)
                .get(URLMenuCategoryRecommend);
    }

}
