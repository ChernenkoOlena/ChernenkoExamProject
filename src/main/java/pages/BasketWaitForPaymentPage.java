package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketWaitForPaymentPage extends ParentPage {
    @FindBy(xpath = ".//img[@src='catalog/view/image/close.png']")
    private WebElement removeButton;

    private BasketCheckOutPage basketCheckOutPage;

    @FindBy(xpath = ".//a[@href='http://kemp.ua/index.php?route=common/home'][contains(text(),'Главная')]")
    private WebElement menuHomePage;

    public BasketWaitForPaymentPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=checkout/simplecheckout#wait_for_payment");
        basketCheckOutPage = new BasketCheckOutPage(webDriver);
    }


    public boolean isNewItemAdded(String nameOfAmortisator4784) {
        return actionsWithOurElements.isElementEnable(".//*[contains(text(),'"+ nameOfAmortisator4784 +"')]");
    }


    public void clickOnButtonDelete() {
        actionsWithOurElements.clickOnElement(removeButton);
    }

    public boolean isGoodInList(String nameOfAmortisator4784) {
        return actionsWithOurElements.isElementInList(".//*[contains(text(),'"+ nameOfAmortisator4784 +"')]");
    }

    public void deletingAllItemsWithName(String nameOfAmortisator4784){
        while (isGoodInList(nameOfAmortisator4784)) {
            clickOnButtonDelete();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            basketCheckOutPage.getCurrentUrl();
            logger.info("Item with name " + nameOfAmortisator4784 + " was deleted");
        }
    }

    public void clickOnMenuHomePage() {
        actionsWithOurElements.clickOnElement(menuHomePage);
    }
}
