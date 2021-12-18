package pages;

public class Constants {

    //For AccountPage
    public static final String BASE_URL = "https://moodpanda.com";
    public static final String ACCOUNT_URL = BASE_URL + "/Account/";
    public static final String TIME_ZONE_DROP_DOWN_CSS = "#ContentPlaceHolderContent_DropDownListTimeZone";
    public static final String COUNTRY_DROP_DOWN_CSS = "#ContentPlaceHolderContent_DropDownListCountry";
    public static final String NEW_PASSWORD_CSS = "#ContentPlaceHolderContent_TextBoxNewPassword";
    public static final String CONFIRM_PASSWORD_CSS = "#ContentPlaceHolderContent_TextBoxNewPasswordConfirm";
    public static final String BUTTON_UPDATE_DETAILS_CSS = "#ContentPlaceHolderContent_ButtonSave";
    public static final String ERROR_MESSAGE_CSS = "#ContentPlaceHolderContent_MessageErrorPassword";
    public static final String SUCCESS_MESSAGE_CSS = "#ContentPlaceHolderContent_MessageSuccess";

    //For AvatarPage
    public static final String ACCOUNT_DROP_DOWN_CSS = "#Settings";
    public static final String ACCOUNT_CSS = "a[href='/Account/Avatar']";
    public static final String AVATAR_CSS = "#ContentPlaceHolderContent_RepeaterImage_ImageButton1_7";
    public static final String MY_AVATAR_CSS = "#ContentPlaceHolderContent_MyMoodPandaNav1_ImageProfile";

    //For MoodUpdateModalPage
    public static final String BUTTON_GO_TO_MY_DIARY = ".ButtonMyDiary";

    //For MyDiaryPage
    public static final String BADGE_MOOD = ".media-body>h5>span";
    public static final String DATE_MY_MOOD = ".col-xs-8";
    public static final String TEXT_FROM_MY_DIARY_MOOD = ".MoodPostItem.media-content";

    //For RateYourHappinessModalPage
    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".btn-primary.ButtonUpdate";
    public static final String TEXT_BOX_CSS = "#TextBoxUpdateMoodTag";
    public static final String DATE_PICKER_TRIGGER_CSS = "#DatePicker+.ui-datepicker-trigger";
    public static final String DAYS_OF_MONTH_CONTENT_CSS = "#ui-datepicker-div > table > tbody > tr > td > a";
    public static final String HEADER_MONTH_CALENDAR_CSS = "select[class='ui-datepicker-month']";
    public static final String HEADER_YEARS_CALENDAR_CSS = "select[class='ui-datepicker-year']";
}
