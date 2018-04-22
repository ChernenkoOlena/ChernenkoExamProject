package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpelPage extends ParentPage {
    @FindBy(xpath = ".//a[@href='http://kemp.ua/2-OPEL/2,1-Amortizatory'][contains(text(),'- 2,1 Амортизаторы (51)')]")
    private WebElement subMenuAmortisatory;

    public OpelPage(WebDriver webDriver) {
        super(webDriver, "/2-OPEL");
    }


    public void clickOnSubMenuAmortisatory() {
        actionsWithOurElements.clickOnElement(subMenuAmortisatory);
    }
}
