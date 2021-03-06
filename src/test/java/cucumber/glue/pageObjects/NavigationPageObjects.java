package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverManager;
import org.springframework.beans.factory.annotation.Autowired;

@PageObject
public class NavigationPageObjects {

    @Autowired
    private WebDriverManager webDriverManager;

    public void getPage(String url) {
        webDriverManager.getDriver().navigate().to(url);
    }

    public String getCurrentUrl() {
        return webDriverManager.getDriver().getCurrentUrl();
    }
}
