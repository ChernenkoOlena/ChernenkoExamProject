package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends ParentPage {
    @FindBy(xpath = ".//img[@src='catalog/view/theme/default/image/remove.png']")
    private WebElement buttonRemove;

    public WishListPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=account/wishlist");
    }

    public void clickOnButtonRemoveWishList() {
        actionsWithOurElements.clickOnElement(buttonRemove);
    }


    public boolean isNewWishAdded(String nameOfNewGood4784) {
        return actionsWithOurElements.isElementEnable(".//*[contains(text(),'"+ nameOfNewGood4784 +"')]");
    }

    public void deletingAllGoodsWithName(String nameOfNewGood4784){
        clickOnButtonRemoveWishList();
        logger.info("Good with name " + nameOfNewGood4784 + " was deleted");
    }
}
