package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverManager;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@PageObject
public abstract class BasePage {

    @Autowired
    private WebDriverManager webDriverManager;

    public BasePage(WebDriverManager webDriverManager) {
        PageFactory.initElements(webDriverManager.getDriver(), this);
    }
}
