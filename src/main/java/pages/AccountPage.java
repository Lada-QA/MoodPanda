package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class AccountPage extends BasePage{

    public AccountPage openPage() {
        openURL(ACCOUNT_URL);
        return this;
    }

    public String chooseTimeZone(String timeZone) {
        log.info("Choose option from dropDown TimeZone: " + timeZone);
        $(TIME_ZONE_DROP_DOWN_CSS).selectOptionByValue(timeZone);
        return $(TIME_ZONE_DROP_DOWN_CSS).shouldBe(Condition.visible).getText();
    }

    public String chooseCountryZone(String country) {
        log.info("Choose option from DropDown CountryZone: " + country);
        $(COUNTRY_DROP_DOWN_CSS).selectOptionByValue(country);
        return $(COUNTRY_DROP_DOWN_CSS).shouldBe(Condition.visible).getText();
    }

    public AccountPage changedPassword(String newPassword, String confirmPassword) {
        log.info("Changed password for account: " + newPassword);
        $(NEW_PASSWORD_CSS).sendKeys(newPassword);
        log.info("Changed password for account: " + confirmPassword);
        $(CONFIRM_PASSWORD_CSS).sendKeys(confirmPassword);
        return this;
    }

    public AccountPage clickButtonUpdateDetails() {
        log.info("Click button 'Update details' on Account Page");
        $(BUTTON_UPDATE_DETAILS_CSS).click();
        return this;
    }

    public String getErrorMessage() {
        return $(ERROR_MESSAGE_CSS).shouldBe(Condition.visible).getText();
    }

    public String getSuccessMessage() {
        return $(SUCCESS_MESSAGE_CSS).getText();
    }
}