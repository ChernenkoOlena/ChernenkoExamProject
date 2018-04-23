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
}
