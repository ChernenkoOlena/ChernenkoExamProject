package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends ParentPage {

    @FindBy(xpath = ".//a[@href='http://kemp.ua/index.php?route=account/account'][contains(text(),'Lena')]")
    private WebElement avatar;

    @FindBy(xpath = ".//*[@class='links']//a[@href='http://kemp.ua/index.php?route=common/home']")
    private WebElement turnToHomePage;

    @FindBy(xpath = ".//a[@href='http://kemp.ua/index.php?route=account/logout'][contains(text(),'Выйти')]")
    private WebElement buttonExit;


    public AccountPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=account/account");
    }

    public boolean isAvatarPresent(){
       return actionsWithOurElements.isElementPresent(avatar);
    }

    public void checkAvatarIsPresent() {
        Assert.assertTrue("Avatar is not present", isAvatarPresent());
    }


    public void clickOnButtonHomePage() {
        actionsWithOurElements.clickOnElement(turnToHomePage);
    }

    public void clickOnButtonExit() {
        actionsWithOurElements.clickOnElement(buttonExit);
    }
}
