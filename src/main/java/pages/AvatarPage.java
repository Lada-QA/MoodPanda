package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class AvatarPage extends BasePage {

    public AvatarPage chooseNewAvatar() {
        log.info("Click 'Account' DropDown");
        $(ACCOUNT_DROP_DOWN_CSS).click();
        log.info("Click 'Avatar' option from DropDown");
        $(ACCOUNT_CSS).click();
        log.info("Choose new avatar");
        $(AVATAR_CSS).click();
        return this;
    }

    public boolean isMyAvatarDisplayed() {
        return $(MY_AVATAR_CSS).shouldBe(Condition.visible).isDisplayed();
    }
}