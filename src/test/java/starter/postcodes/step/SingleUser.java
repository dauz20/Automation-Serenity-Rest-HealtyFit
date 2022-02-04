package starter.postcodes.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class SingleUser {
    public static String
            URL ="https://reqres.in/api/users/{id}";
    @Step
    public void fetchSingleUser(int userID){
        SerenityRest.given()
                .pathParam("id",userID)
                .get(URL);
    }

}
