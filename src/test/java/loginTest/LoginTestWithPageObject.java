package loginTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject extends ParentTest{

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.enterLogin("helen.cher6@gmail.com");
        loginPage.enterPassword("vesna18");
        loginPage.clickSubmitButton();

        checkAC ("Avatar is not present",accountPage.isAvatarPresent(), true);
    }

    @Test
    public void invalidLogin(){
        loginPage.userLogin("helen.cher6@gmail.com", "vesna17");

        checkAC("Avatar should not be present", accountPage.isAvatarPresent(), false);
    }
}
