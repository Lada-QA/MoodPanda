package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class FeedPage extends BasePage {
    public static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";

    public FeedPage waitForMoodButtonVisible() {
        $(UPDATE_MOOD_BUTTON_CSS).shouldBe(Condition.visible, Duration.ofSeconds(3));
        return this;
    }

    public RateYourHappinessModalPage clickUpdateMoodButton() {
        log.info("Click 'Update Mood' button on Mood Update Page");
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }
}