import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import steps.ClickButtonsSteps;
import steps.LoginStep;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;
    FeedPage feedPage;
    MoodUpdatedModalPage moodUpdatedModalPage;
    MyDiaryPage myDiaryPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;
    AvatarPage avatarPage;
    AccountPage accountPage;
    LoginStep loginStep;
    ClickButtonsSteps clickButtonsSteps;

    public static final String EMAIL = "ladauser@mailinator.com";
    public static final String PASSWORD = "engEng1234";

    @BeforeMethod
    public void init() {
        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;

        loginPage = new LoginPage();
        feedPage = new FeedPage();
        moodUpdatedModalPage = new MoodUpdatedModalPage();
        myDiaryPage = new MyDiaryPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();
        avatarPage = new AvatarPage();
        accountPage = new AccountPage();
        loginStep = new LoginStep();
        clickButtonsSteps = new ClickButtonsSteps();
    }

    @AfterMethod
    public void quit() {
        getWebDriver().quit();
    }
}