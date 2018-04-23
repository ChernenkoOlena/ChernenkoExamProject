package basketTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewToBasketTest extends ParentTest {
    @Test
    public void addNewToBasketTest(){
        loginPage.userLogin("helen.cher6@gmail.com", "vesna18");
        accountPage.getCurrentUrl();
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnButtonHomePage();
        homePage.checkCurrentUrl();
        homePage.clickOnMenuOpel();
        opelPage.getCurrentUrl();
        opelPage.clickOnSubMenuAmortisatory();
        amortisatoryOpelPage.getCurrentUrl();
        amortisatoryOpelPage.addNewFromSubMenuAmortisatoryGood4784();
        subAmortisatoryOpelPage.getCurrentUrl();
        subAmortisatoryOpelPage.clickOnButtonBuy();
        subAmortisatoryOpelPage.clickOnButtonBasket();
        basketWaitForPayment.getCurrentUrl();

//        checkAC

        basketWaitForPayment.getTheBasketEmpty();
        setOrderingPage.getCurrentUrl();
    }

}
