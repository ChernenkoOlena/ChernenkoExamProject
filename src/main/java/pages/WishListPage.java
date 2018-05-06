package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends ParentPage {
    @FindBy(xpath = ".//img[@src='catalog/view/theme/default/image/remove.png']")
    private WebElement buttonRemove;
    @FindBy(xpath = ".//*[@class='links']//a[@href='http://kemp.ua/index.php?route=common/home']")
    private WebElement menuHomePage;

    public WishListPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=account/wishlist");
    }

    public void clickOnButtonRemoveWishList() {
        actionsWithOurElements.clickOnElement(buttonRemove);
    }


    public boolean isNewWishAdded(String nameOfNewGood4784) {
        return actionsWithOurElements.isElementEnable(".//*[contains(text(),'"+ nameOfNewGood4784 +"')]");
    }

    public void deletingAllItemsWithName(String nameOfNewGood4784){
        while (isWishInList(nameOfNewGood4784)) {
            clickOnButtonRemoveWishList();
            logger.info("Item with name " + nameOfNewGood4784 + " was deleted");
        }
    }

    private boolean isWishInList(String nameOfNewGood4784) {
        return actionsWithOurElements.isElementInList(".//*[contains(text(),'"+ nameOfNewGood4784 +"')]");
    }

    public void clickOnMenuHomePage() {
        actionsWithOurElements.clickOnElement(menuHomePage);
    }
}
