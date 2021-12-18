package pages;

import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class LoginPage extends BasePage {

    private static final String LOGIN_URL = BASE_URL + "/Login/";
    private static final String EMAIL_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxEmail";
    private static final String PASSWORD_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxPassword";
    private static final String LOGIN_BUTTON_CSS = "#ContentPlaceHolderContent_ButtonLogin";

    public LoginPage openPage() {
        openURL(LOGIN_URL);
        return this;
    }

    public FeedPage login(String email, String password) {
        log.info("Filling field email: " + email);
        $(EMAIL_INPUT_CSS).sendKeys(email);
        log.info("Filling field password: " + password);
        $(PASSWORD_INPUT_CSS).sendKeys(password);
        log.info("Click 'Login' button");
        $(LOGIN_BUTTON_CSS).click();
        return new FeedPage();
    }
}