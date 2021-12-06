package steps;

import lombok.extern.log4j.Log4j2;
import pages.FeedPage;
import pages.LoginPage;

@Log4j2
public class LoginStep {
    LoginPage loginPage = new LoginPage();

    public FeedPage login(String email, String password) {
        loginPage.openPage()
                .login(email, password);
        return new FeedPage();
    }
}