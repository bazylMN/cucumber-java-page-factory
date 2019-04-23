package cucumber.glue.assertions;

import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class NavigationPageAssertions {

    public void assertPageIsCorrect(String currentPage, String name) {
        Assert.assertTrue(currentPage.contains(name));
    }
}
