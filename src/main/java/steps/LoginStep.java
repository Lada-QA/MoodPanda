package steps;

import pages.FeedPage;
import pages.LoginPage;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    public FeedPage login(String email, String password) {
        loginPage.openPage()
                .login(email, password);
        return new FeedPage();
    }
}