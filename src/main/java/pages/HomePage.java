package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//a[@href='http://kemp.ua/2-OPEL'][contains(text(),'- 2 OPEL (481)')]")
    private WebElement menuOpel;
    @FindBy(xpath = "//a[@href='http://kemp.ua/index.php?route=checkout/simplecheckout'][contains(text(),'Корзина покупок')]")
    private WebElement menuBasket;

    public HomePage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=common/home");
    }

    public void clickOnMenuOpel() {
        actionsWithOurElements.clickOnElement(menuOpel);
    }

    public void clickOnMenuBasket() {
        actionsWithOurElements.clickOnElement(menuBasket);
    }
}
