package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverManager;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@Lazy
@PageObject
public class BasePage {

    @Autowired
    private WebDriverManager driver;

    public BasePage(WebDriverManager driver) {
        PageFactory.initElements(driver.getDriver(), this);
    }
}
