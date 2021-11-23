package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RateYourHappinessModalPage {

    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".btn-primary.ButtonUpdate";
    public static final String TEXT_BOX_CSS = "#TextBoxUpdateMoodTag";
    public static final String DATE_PICKER_TRIGGER_CSS = "#DatePicker+.ui-datepicker-trigger";
    public static final String DAYS_OF_MONTH_CONTENT_CSS = "#ui-datepicker-div > table > tbody > tr > td > a";
    public static final String HEADER_MONTH_CALENDAR_CSS = "select[class='ui-datepicker-month']";
    public static final String HEADER_YEARS_CALENDAR_CSS = "select[class='ui-datepicker-year']";

    public MoodUpdatedModalPage updateMood(int moodValue) {
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
        $(TEXT_BOX_CSS).sendKeys(text);
        return this;
    }

    public RateYourHappinessModalPage setDateCalendar(int dateCalendar) {
        $(DATE_PICKER_TRIGGER_CSS).click();
        $$(DAYS_OF_MONTH_CONTENT_CSS).get(dateCalendar).click();
        return this;
    }

    public RateYourHappinessModalPage setMonthAndYearCalendar(int dateMonth, int dateYears) {
        $(DATE_PICKER_TRIGGER_CSS).click();
        $(HEADER_MONTH_CALENDAR_CSS).selectOption(dateMonth);
        $(HEADER_YEARS_CALENDAR_CSS).selectOption(dateYears);
        return this;
    }
}