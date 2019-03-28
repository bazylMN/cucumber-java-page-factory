package cucumber.glue.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import org.springframework.beans.factory.annotation.Autowired;

public class AfterHelper {

    @Autowired
    private TakesScreenshots takesScreenshots;

    @AfterStep()
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            takesScreenshots.takesScreenshot(scenario);
        }
    }
}
