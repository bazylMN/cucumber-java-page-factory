package cucumber.glue.steps;

import cucumber.api.java8.En;
import cucumber.glue.assertions.SignUpFormPageAssertions;
import cucumber.glue.dataTableMapping.SignUpFormDataTableMapping;
import cucumber.glue.pageObjects.SignUpFormPageObjects;
import io.cucumber.datatable.DataTable;
import org.springframework.beans.factory.annotation.Autowired;

public class SignUpFormPageSteps implements En {

    @Autowired
    private SignUpFormPageObjects signUpFormPageObjects;
    @Autowired
    private SignUpFormDataTableMapping dataMap;
    @Autowired
    private SignUpFormPageAssertions assertions;

    public SignUpFormPageSteps() {
        When("^I fill form fields with data$", (DataTable fields) -> {
            dataMap.writeDataToMap(fields);
            signUpFormPageObjects.signUp(
                    dataMap.get().get("login").toString(),
                    dataMap.get().get("email").toString(),
                    dataMap.get().get("password").toString());
        });

        Then("^I should see form with filled fields$", () -> {
            assertions.assertSignUpDataAreCorrect(
                    signUpFormPageObjects.shouldSeeLoginData(), dataMap.get().get("login").toString(),
                    signUpFormPageObjects.shouldSeeEmailData(), dataMap.get().get("email").toString(),
                    signUpFormPageObjects.shouldSeePasswordData(), dataMap.get().get("password").toString());
        });
    }
}
