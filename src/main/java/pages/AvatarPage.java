package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class AvatarPage {

    public static final String ACCOUNT_DROP_DOWN_CSS = "#Settings";
    public static final String ACCOUNT_CSS = "a[href='/Account/Avatar']";
    public static final String AVATAR_CSS = "#ContentPlaceHolderContent_RepeaterImage_ImageButton1_7";
    public static final String MY_AVATAR_CSS = "#ContentPlaceHolderContent_MyMoodPandaNav1_ImageProfile";

    public AvatarPage chooseNewAvatar() {
        $(ACCOUNT_DROP_DOWN_CSS).click();
        $(ACCOUNT_CSS).click();
        $(AVATAR_CSS).click();
        return this;
    }

    public boolean isMyAvatarDisplayed() {
        return $(MY_AVATAR_CSS).shouldBe(Condition.visible).isDisplayed();
    }
}