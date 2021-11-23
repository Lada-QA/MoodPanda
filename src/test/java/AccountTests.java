import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTests extends BaseTest {

    @Test(description = "Filling field with new password on Edit Profile in Account and " +
            "clicking button to save changes, we should be get error message")
    public void getErrorMessageWithoutConfirmPasswordTest() {
        loginStep.login(EMAIL, PASSWORD);
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
        loginStep.login(EMAIL, PASSWORD);
        accountPage.openPage()
                .changedPassword("engEng1234", "engEng1234")
                .clickButtonUpdateDetails();
        Assert.assertEquals(accountPage.getSuccessMessage(), "×\n" +
                "Success! Your changes were saved");
        Assert.assertEquals(accountPage.chooseTimeZone("2"), "(GMT +2:00) Kaliningrad, South Africa");
        Assert.assertEquals(accountPage.chooseCountryZone("26"), "Belarus");
    }

    @Test(description = "Choose and safe new Avatar in Account Page, checking new avatar on isDisplayed")
    public void createNewAvatarTest() {
        loginStep.login(EMAIL, PASSWORD);
        avatarPage.chooseNewAvatar();
        Assert.assertTrue(avatarPage.checkMyAvatar());
    }
}