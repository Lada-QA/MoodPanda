package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class MoodPandaTest extends BaseTest {

    @Test(description = "filling fields for login on website, choose Mood, click button Update Mood and checking" +
            "mood in My Diary Page")
    public void moodTest() {
        loginStep.login(System.getProperty("email", PropertyReader.getProperty("email")),
                System.getProperty("password", PropertyReader.getProperty("password")));
        clickButtonsSteps.clickUpdateMoodButtonAndWait();
        clickButtonsSteps.createMood(9);
        Assert.assertEquals(myDiaryPage.getNumberBadgeMood(), "9");
    }

    @Test(description = "filling TextBox for displayed on My diary page")
    public void textFromFeedMoodTest() {
        loginStep.login(System.getProperty("email", PropertyReader.getProperty("email")),
                System.getProperty("password", PropertyReader.getProperty("password")));
        clickButtonsSteps.clickUpdateMoodButtonAndWait()
                .setMessageInTextBox("My mood is very good");
        clickButtonsSteps.createMood(7);
        Assert.assertEquals(myDiaryPage.getTextFromMyDiary(), "My mood is very good");
    }

    @Test(description = "choosing the date of my mood and checking the date display")
    public void calendarMoodTest() {
        loginStep.login(System.getProperty("email", PropertyReader.getProperty("email")),
                System.getProperty("password", PropertyReader.getProperty("password")));
        clickButtonsSteps.clickUpdateMoodButtonAndWait()
                .setMonthAndYearCalendar(5, 8)
                .setDateCalendar(11);
        clickButtonsSteps.createMood(7);
        Assert.assertEquals(myDiaryPage.getDateFromMyDiary(), "12 Jun 2019");
    }
}