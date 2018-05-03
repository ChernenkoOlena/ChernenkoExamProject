package newsLetterTest;

import org.junit.Test;
import parentTest.ParentTest;

public class SubscriptionOfNewsLetterTest extends ParentTest {
    final String login = "helen.cher6@gmail.com";
    final String pass = "vesna18";

    @Test
    public void SubscriptionOfNewsLetterTest(){
        loginPage.userLogin(login, pass);
        accountPage.getCurrentUrl();
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnSubMenuEmailSending();
        newsLetterPage.getCurrentUrl();
        newsLetterPage.clickOnYesOrNoButton();
        newsLetterPage.clickOnElementContinue();
        accountPage.getCurrentUrl();

        checkAC("Notification is not present", accountPage.isNotificationPresent(), true);

    }
}
