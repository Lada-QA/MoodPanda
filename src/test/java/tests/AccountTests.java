package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class AccountTests extends BaseTest {

    @Test(description = "Filling field with new password on Edit Profile in Account and " +
            "clicking button to save changes, we should be get error message")
    public void getErrorMessageWithoutConfirmPasswordTest() {
        loginStep.login(System.getProperty("email", PropertyReader.getProperty("email")),
                System.getProperty("password", PropertyReader.getProperty("password")));
        accountPage.openPage()
                .changedPassword("Lala1253", "")
                .clickButtonUpdateDetails()
                .getErrorMessage();
        Assert.assertEquals(accountPage.getErrorMessage(), "×\n" +
                "Error: New Password and New Password Confirm do not match");
    }

    @Test(description = "Filling field with new password and confirm password on Edit Profile in Account and " +
            "change TimeZone and Country, clicking button to save changes, we should be get Success message")
    public void getSuccessMessageAndNewTimeCountryTest() {
        loginStep.login(System.getProperty("email", PropertyReader.getProperty("email")),
                System.getProperty("password", PropertyReader.getProperty("password")));
        accountPage.openPage()
                .changedPassword(System.getProperty("newPassword", PropertyReader.getProperty("newPassword")),
                System.getProperty("confirmPassword", PropertyReader.getProperty("confirmPassword")))
                .clickButtonUpdateDetails();
        Assert.assertEquals(accountPage.getSuccessMessage(), "×\n" +
                "Success! Your changes were saved");
        Assert.assertEquals(accountPage.chooseTimeZone("2"), "(GMT +2:00) Kaliningrad, South Africa");
        Assert.assertEquals(accountPage.chooseCountryZone("26"), "Belarus");
    }

    @Test(description = "Choose and safe new Avatar in Account Page, checking new avatar on isDisplayed")
    public void createNewAvatarTest() {
        loginStep.login(System.getProperty("email", PropertyReader.getProperty("email")),
                System.getProperty("password", PropertyReader.getProperty("password")));
        avatarPage.chooseNewAvatar();
        Assert.assertTrue(avatarPage.isMyAvatarDisplayed());
    }
}