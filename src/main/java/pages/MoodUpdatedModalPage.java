package pages;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage {

    public static final String BUTTON_GO_TO_MY_DIARY = ".ButtonMyDiary";

    public MyDiaryPage clickButtonGoToMyDiary() {
        $(BUTTON_GO_TO_MY_DIARY).click();
        return new MyDiaryPage();
    }
}