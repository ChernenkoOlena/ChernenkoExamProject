package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmortisatoryOpelPage extends ParentPage {
    @FindBy(xpath = ".//a[@href='http://kemp.ua/2-OPEL/2,1-Amortizatory/Amortizator--kryshki-bagazhnika-Opel-Ascona-C--512-200mm-450N-132693']")
    private WebElement amortisatoryGood4784;

    public AmortisatoryOpelPage(WebDriver webDriver) {
        super(webDriver, "/2-OPEL/2,1-Amortizatory");
    }

    public void addNewFromSubMenuAmortisatoryItem4784() {
        actionsWithOurElements.clickOnElement(amortisatoryGood4784);
    }
}
