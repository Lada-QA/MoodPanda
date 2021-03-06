package steps;

import lombok.extern.log4j.Log4j2;
import pages.FeedPage;
import pages.RateYourHappinessModalPage;

@Log4j2
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