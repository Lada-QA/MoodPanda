package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Log4j2
public class RateYourHappinessModalPage extends BasePage{

    public MoodUpdatedModalPage updateMood(int moodValue) {
        log.info("Create mood with Slider 'update mood': " + moodValue);
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue) {
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatedModalPage();
    }

    public RateYourHappinessModalPage setMessageInTextBox(String text) {
        log.info("Set message in textBox: " + text);
        $(TEXT_BOX_CSS).sendKeys(text);
        return this;
    }

    public RateYourHappinessModalPage setDateCalendar(int dateCalendar) {
        log.info("Set date in calendar: " + dateCalendar);
        $(DATE_PICKER_TRIGGER_CSS).click();
        $$(DAYS_OF_MONTH_CONTENT_CSS).get(dateCalendar).click();
        return this;
    }

    public RateYourHappinessModalPage setMonthAndYearCalendar(int dateMonth, int dateYears) {
        log.info("Click button 'date picker trigger'");
        $(DATE_PICKER_TRIGGER_CSS).click();
        log.info("Choose month from calendar: " + dateMonth);
        $(HEADER_MONTH_CALENDAR_CSS).selectOption(dateMonth);
        log.info("Choose years from calendar: " + dateYears);
        $(HEADER_YEARS_CALENDAR_CSS).selectOption(dateYears);
        return this;
    }
}