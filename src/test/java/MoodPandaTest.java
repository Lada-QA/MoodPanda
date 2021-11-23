import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    @Test(description = "filling fields for login on website, choose Mood, click button Update Mood and checking" +
            "mood in My Diary Page")
    public void moodTest() {
        loginStep.login(EMAIL, PASSWORD);
        clickButtonsSteps.clickUpdateMoodButtonAndWait();
        clickButtonsSteps.createMood(9);
        Assert.assertEquals(myDiaryPage.getNumberBadgeMood(), "9");
    }

    @Test(description = "filling TextBox for displayed on My diary page")
    public void textFromFeedMoodTest() {
        loginStep.login(EMAIL, PASSWORD);
        clickButtonsSteps.clickUpdateMoodButtonAndWait()
                .setMessageInTextBox("My mood is very good");
        clickButtonsSteps.createMood(7);
        Assert.assertEquals(myDiaryPage.getTextFromMyDiary(), "My mood is very good");
    }

    @Test(description = "choosing the date of my mood and checking the date display")
    public void calendarMoodTest() {
        loginStep.login(EMAIL, PASSWORD);
        clickButtonsSteps.clickUpdateMoodButtonAndWait()
                .setMonthAndYearCalendar(5, 8)
                .setDateCalendar(11);
        clickButtonsSteps.createMood(7);
        Assert.assertEquals(myDiaryPage.dateFromMyDiary(), "12 Jun 2019");
    }
}