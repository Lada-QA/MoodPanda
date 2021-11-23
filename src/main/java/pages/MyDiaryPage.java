package pages;

import static com.codeborne.selenide.Selenide.$;

public class MyDiaryPage {

    public static final String BADGE_MOOD = ".media-body>h5>span";
    public static final String DATE_MY_MOOD = ".col-xs-8";
    public static final String TEXT_FROM_MY_DIARY_MOOD = ".MoodPostItem.media-content";

    public String getTextFromMyDiary() {
        return $(TEXT_FROM_MY_DIARY_MOOD).getText();
    }

    public String dateFromMyDiary() {
        return $(DATE_MY_MOOD).getText();
    }

    public String getNumberBadgeMood() {
        return $(BADGE_MOOD).getText();
    }
}