package pages;

import org.openqa.selenium.WebDriver;

public class BasketCheckOutPage extends ParentPage {
    public BasketCheckOutPage(WebDriver webDriver) {
        super(webDriver, "/index.php?route=checkout/simplecheckout");
    }
}
