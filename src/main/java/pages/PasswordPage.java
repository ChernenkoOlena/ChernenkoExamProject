package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends ParentPage {
    @FindBy(name = "password")
    private WebElement fieldNewPass;
    @FindBy(name = "confirm")
    private WebElement fieldConfirmPass;
    @FindBy(xpath = ".//input[@type='submit']")
    private WebElement buttonContinue;

    public PasswordPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=account/password");
    }

    public void enterNewPass(String newPass) {
        actionsWithOurElements.enterTextIntoElement(fieldNewPass, newPass);
    }

    public void confirmNewPass(String newPass) {
        actionsWithOurElements.enterTextIntoElement(fieldConfirmPass, newPass);
    }

    public void clickOnButtonContinue() {
        actionsWithOurElements.clickOnElement(buttonContinue);
    }
}
