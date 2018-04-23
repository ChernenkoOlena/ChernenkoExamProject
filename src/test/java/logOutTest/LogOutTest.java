package logOutTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ParentPage;
import parentTest.ParentTest;

public class LogOutTest extends ParentTest {
    @Test
    public void logOutTest(){
        loginPage.userLogin("helen.cher6@gmail.com", "vesna18");
        accountPage.getCurrentUrl();
        accountPage.clickOnButtonExit();
        logOutPage.getCurrentUrl();

        checkAC("Avatar should not be present", logOutPage.isAvatarPresent(), false);
    }

}
