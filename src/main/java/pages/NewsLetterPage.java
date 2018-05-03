package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsLetterPage extends ParentPage {
    @FindBy(xpath = ".//tr/td[2]/input[1]")
    private WebElement yesButton;
    @FindBy(xpath = ".//input[@type='submit']")
    private WebElement buttonContinue;
    @FindBy(xpath = ".//tr/td[2]/input[2]")
    private WebElement noButton;

    public NewsLetterPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=account/newsletter");
    }

    public void clickOnYesButton() {
        actionsWithOurElements.clickOnElement(yesButton);
    }

    public void clickOnElementContinue() {
        actionsWithOurElements.clickOnElement(buttonContinue);
    }

    public void clickOnNoButton() {
        actionsWithOurElements.clickOnElement(noButton);
    }
}
