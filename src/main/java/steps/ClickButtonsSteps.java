package steps;

import pages.FeedPage;
import pages.RateYourHappinessModalPage;

public class ClickButtonsSteps {
    FeedPage feedPage = new FeedPage();
    RateYourHappinessModalPage rateYourHappinessModalPage = new RateYourHappinessModalPage();

    public RateYourHappinessModalPage clickUpdateMoodButtonAndWait() {
        feedPage.waitForMoodButtonVisible()
                .clickUpdateMoodButton();
        return new RateYourHappinessModalPage();
    }

    public void createMood(int moodValue) {
        rateYourHappinessModalPage.updateMood(moodValue)
                .clickButtonGoToMyDiary();
    }
}