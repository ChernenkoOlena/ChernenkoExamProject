package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObjectWithExel extends ParentTest{
    final String login = "helen.cher6@gmail.com";
    final String pass = "vesna18";
    final String wrongPass = "vesna17";

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.enterLogin(login);
        loginPage.enterPassword(pass);
        loginPage.clickSubmitButton();

        checkAC ("Avatar is not present",accountPage.isAvatarPresent(), true);
    }

    @Test
    public void invalidLogin(){
        loginPage.userLogin(login, wrongPass);

        checkAC("Avatar should not be present", accountPage.isAvatarPresent(), false);
    }
}
