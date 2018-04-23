package pages;

import org.openqa.selenium.WebDriver;

public class SetOrderingPage extends ParentPage {
    public SetOrderingPage(WebDriver webDriver) {
        super(webDriver,"/index.php?route=checkout/simplecheckout");
    }
}
