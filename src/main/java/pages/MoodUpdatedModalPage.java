package pages;

import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class MoodUpdatedModalPage extends BasePage{

    public static final String BUTTON_GO_TO_MY_DIARY = ".ButtonMyDiary";

    public MyDiaryPage clickButtonGoToMyDiary() {
        log.info("Click 'Go to my Diary' button");
        $(BUTTON_GO_TO_MY_DIARY).click();
        return new MyDiaryPage();
    }
}