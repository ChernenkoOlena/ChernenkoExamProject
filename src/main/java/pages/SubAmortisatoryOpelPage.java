package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubAmortisatoryOpelPage extends ParentPage {
    @FindBy(id = "button-cart")
    private WebElement buttonBy;

    @FindBy(xpath = ".//a[@href='http://kemp.ua/index.php?route=checkout/simplecheckout'][contains(text(),'Корзина покупок')]")
    private WebElement buttonBasket;

    @FindBy(xpath = ".//*[text()='В закладки']")
    private WebElement buttonWishList;

    @FindBy(id = "wishlist-total")
    private WebElement menuWishList;

    public SubAmortisatoryOpelPage(WebDriver webDriver) {
        super(webDriver, "/2-OPEL/2,1-Amortizatory/Amortizator--kryshki-bagazhnika-Opel-Ascona-C--512-200mm-450N-132693");
    }

    public void clickOnButtonBuy() {
        actionsWithOurElements.clickOnElement(buttonBy);
    }

    public void clickOnButtonBasket() {
        actionsWithOurElements.clickOnElement(buttonBasket);
    }

    public void clickOnButtonAddToWishList() {
        actionsWithOurElements.clickOnElement(buttonWishList);
    }

    public void clickOnMenuWishList() {
        actionsWithOurElements.clickOnElement(menuWishList);
    }
}
