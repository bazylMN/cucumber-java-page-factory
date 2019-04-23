package cucumber.glue.assertions;

import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class SignUpFormPageAssertions {

    public void assertSignUpDataAreCorrect(String shouldSeeLoginData, String login, String shouldSeeEmailData, String email, String shouldSeePasswordData, String password) {
        assertThat(shouldSeeLoginData).isEqualTo(login);
        assertThat(shouldSeeEmailData).isEqualTo(email);
        assertThat(shouldSeePasswordData).isEqualTo(password);
    }
}
