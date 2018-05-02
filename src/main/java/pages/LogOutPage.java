package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends ParentPage {
    @FindBy(xpath = ".//a[@href='http://kemp.ua/index.php?route=account/account'][contains(text(),'Lena')]")
    private WebElement avatar;
    @FindBy(xpath = ".//*[contains(text(),'Войти')]")
    private WebElement buttonEnter;

    public LogOutPage(WebDriver webDriver) {
        super(webDriver,"/index.php?route=account/logout");
    }

    public boolean isAvatarPresent(){
        return actionsWithOurElements.isElementPresent(avatar);
    }

    public void clickOnButtonEnter() {
        actionsWithOurElements.clickOnElement(buttonEnter);
    }
}
