package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketWaitForPaymentPage extends ParentPage {
    @FindBy(xpath = ".//img[@src='catalog/view/image/close.png']")
    private WebElement removeButton;


    public BasketWaitForPaymentPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=checkout/simplecheckout#wait_for_payment");
    }


    public boolean isNewGoodAdded(String nameOfAmortisator4784) {
        return actionsWithOurElements.isElementEnable(".//*[contains(text(),'"+ nameOfAmortisator4784 +"')]");
    }


    public void clickOnButtonDelete() {
        actionsWithOurElements.clickOnElement(removeButton);
    }
}
