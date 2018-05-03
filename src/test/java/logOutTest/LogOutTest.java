package logOutTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ParentPage;
import parentTest.ParentTest;

public class LogOutTest extends ParentTest {
    final String login = "helen.cher6@gmail.com";
    final String pass = "vesna18";

    @Test
    public void logOutTest(){
        loginPage.userLogin(login, pass);
        accountPage.getCurrentUrl();
        accountPage.clickOnButtonExit();
        logOutPage.getCurrentUrl();

        checkAC("Avatar should not be present", logOutPage.isAvatarPresent(), false);
    }

}
