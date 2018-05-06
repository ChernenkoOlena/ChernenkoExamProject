package loginTest;

import com.sun.javaws.Main;
import libs.ConfigProperties;
import libs.ExcelDriver;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class LoginTestWithPageObjectWithExcel extends ParentTest{
    final String login = "helen.cher6@gmail.com";
    final String pass = "vesna18";
    final String wrongPass = "vesna17";

    @Test
    public void validLogOn() throws IOException {
        ExcelDriver excelDriver = new ExcelDriver();
        ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
        Map dataForValidLogIn = excelDriver.getData(configProperties.DATA_FILE(), "validLogOn");
        loginPage.openPage();
        loginPage.enterLogin(dataForValidLogIn.get("login").toString());
        loginPage.enterPassword(dataForValidLogIn.get("pass").toString());
        loginPage.clickSubmitButton();

        checkAC ("Avatar is not present",accountPage.isAvatarPresent(), true);
    }

    @Test
    public void invalidLogin(){
        loginPage.userLogin(login, wrongPass);

        checkAC("Avatar should not be present", accountPage.isAvatarPresent(), false);
    }
}
