package pages;

import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class MyDiaryPage extends BasePage{

    public String getTextFromMyDiary() {
        return $(TEXT_FROM_MY_DIARY_MOOD).getText();
    }

    public String getDateFromMyDiary() {
        return $(DATE_MY_MOOD).getText();
    }

    public String getNumberBadgeMood() {
        return $(BADGE_MOOD).getText();
    }
}