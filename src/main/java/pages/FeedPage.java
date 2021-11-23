package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {
    public static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";

    public FeedPage waitForMoodButtonVisible() {
        $(UPDATE_MOOD_BUTTON_CSS).shouldBe(Condition.visible, Duration.ofSeconds(3));
        return this;
    }

    public RateYourHappinessModalPage clickUpdateMoodButton() {
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }
}