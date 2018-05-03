package basketTest;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class AddNewToBasketTest extends ParentTest {
    final String nameOfAmortisator4784 = "Амортизатор  крышки багажника Opel Ascona C  512-200mm 450N";
    final String login = "helen.cher6@gmail.com";
    final String pass = "vesna18";

    @Test
    public void addNewToBasketTest() {
        loginPage.userLogin(login, pass);
        accountPage.getCurrentUrl();
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnButtonHomePage();
        homePage.checkCurrentUrl();
        homePage.clickOnMenuBasket();
        basketWaitForPaymentPage.getCurrentUrl();
        basketWaitForPaymentPage.deletingAllItemsWithName(nameOfAmortisator4784);
        basketWaitForPaymentPage.clickOnMenuHomePage();
        homePage.getCurrentUrl();
        homePage.clickOnMenuOpel();
        opelPage.getCurrentUrl();
        opelPage.clickOnSubMenuAmortisatory();
        amortisatoryOpelPage.getCurrentUrl();
        amortisatoryOpelPage.addNewFromSubMenuAmortisatoryItem4784();
        subAmortisatoryOpelPage.getCurrentUrl();
        subAmortisatoryOpelPage.clickOnButtonBuy();
        subAmortisatoryOpelPage.clickOnButtonBasket();
        basketWaitForPaymentPage.getCurrentUrl();

        checkAC("New Good wasn't added", basketWaitForPaymentPage.isNewItemAdded(nameOfAmortisator4784), true);
    }

    @After
    public void deleteAddedFromBasket() {
        basketWaitForPaymentPage.deletingAllItemsWithName(nameOfAmortisator4784);
    }

}