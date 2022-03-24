package starter.healtyfit.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class UserList {

    private static String
            URL="https://reqres.in/api/users?page={page}";

    @Step
    public void fetchUserList(int pagenumber){
        SerenityRest.given()
                .pathParam("page",pagenumber)
                .get(URL);
    }
}
