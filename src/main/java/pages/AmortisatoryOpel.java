package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmortisatoryOpel extends ParentPage {
    @FindBy(xpath = ".//a[@href='http://kemp.ua/2-OPEL/2,1-Amortizatory/Amortizator--kryshki-bagazhnika-Opel-Ascona-C--512-200mm-450N-132693']")
    private WebElement amortisatoryGood1;

    public AmortisatoryOpel(WebDriver webDriver) {
        super(webDriver, "/2-OPEL/2,1-Amortizatory");
    }

    public void clickOnSubMenuAmortisatoryGoods() {
        actionsWithOurElements.clickOnElement(amortisatoryGood1);
    }
}
