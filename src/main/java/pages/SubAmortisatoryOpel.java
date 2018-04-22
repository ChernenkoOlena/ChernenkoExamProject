package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubAmortisatoryOpel extends ParentPage {
    @FindBy(id = "button-cart")
    private WebElement buttonBy;

    @FindBy(xpath = ".//a[@href='http://kemp.ua/index.php?route=checkout/simplecheckout'][contains(text(),'Корзина покупок')]")
    private WebElement buttonBasket;

    public SubAmortisatoryOpel(WebDriver webDriver) {
        super(webDriver, "/2-OPEL/2,1-Amortizatory/Amortizator--kryshki-bagazhnika-Opel-Ascona-C--512-200mm-450N-132693");
    }

    public void clickOnButtonBuy() {
        actionsWithOurElements.clickOnElement(buttonBy);
    }

    public void clickOnBasket() {
        actionsWithOurElements.clickOnElement(buttonBasket);
    }
}
