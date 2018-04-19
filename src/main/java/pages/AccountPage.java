package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends ParentPage {

    @FindBy(xpath = ".//a[@href='http://kemp.ua/index.php?route=account/account'][contains(text(),'Lena')]")
    private WebElement avatar;


    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent(){
       return actionsWithOurElements.isElementPresent(avatar);
    }
}
