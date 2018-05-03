package newsLetterTest;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class SubscriptionOfNewsLetterTest extends ParentTest {
    final String login = "helen.cher6@gmail.com";
    final String pass = "vesna18";

    @Test
    public void subscriptionOfNewsLetterTest(){
        loginPage.userLogin(login, pass);
        accountPage.getCurrentUrl();
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnSubMenuEmailSending();
        newsLetterPage.getCurrentUrl();
        newsLetterPage.clickOnYesButton();
        newsLetterPage.clickOnElementContinue();
        accountPage.getCurrentUrl();

        checkAC("Notification is not present", accountPage.isNotificationPresent(), true);

    }

    @After
    public void unSubscriptionOfNewsLetterTest(){
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnSubMenuEmailSending();
        newsLetterPage.getCurrentUrl();
        newsLetterPage.clickOnNoButton();
        newsLetterPage.clickOnElementContinue();
        accountPage.getCurrentUrl();

        checkAC("Notification is not present", accountPage.isNotificationPresent(), true);
    }
}
