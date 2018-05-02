package passwordTests;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class PasswordChahgingTest extends ParentTest {
    final String newPass = "vesna19";
    final String login = "helen.cher6@gmail.com";
    final String pass = "vesna18";

    @Test
    public void PasswordChangingTest(){
        loginPage.userLogin(login, pass);
        accountPage.getCurrentUrl();
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnChangePass();
        passwordPage.getCurrentUrl();
        passwordPage.enterNewPass(newPass);
        passwordPage.confirmNewPass(newPass);
        passwordPage.clickOnButtonContinue();
        accountPage.getCurrentUrl();
        accountPage.clickOnButtonExit();
        logOutPage.getCurrentUrl();
        logOutPage.clickOnButtonEnter();
        loginPage.getCurrentUrl();
        loginPage.userLogin(login, newPass);

        checkAC("Avatar is not present",accountPage.isAvatarPresent(), true);
    }

    @After
    public void bringingBackPass(){
        accountPage.clickOnChangePass();
        passwordPage.getCurrentUrl();
        passwordPage.enterNewPass(pass);
        passwordPage.confirmNewPass(pass);
        passwordPage.clickOnButtonContinue();
        accountPage.getCurrentUrl();
        accountPage.clickOnButtonExit();
    }
}
