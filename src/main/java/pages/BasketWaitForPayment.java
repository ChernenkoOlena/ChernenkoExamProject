package pages;

import org.openqa.selenium.WebDriver;

public class BasketWaitForPayment extends ParentPage {
    public BasketWaitForPayment(WebDriver webDriver) {
        super(webDriver, "/index.php?route=checkout/simplecheckout#wait_for_payment");
    }
}
