package basketTest;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class AddNewToBasketTest extends ParentTest {
    final String nameOfAmortisator4784 = "Амортизатор  крышки багажника Opel Ascona C  512-200mm 450N";

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

        checkAC("New Good wasn't added", basketWaitForPayment.isNewGoodAdded(nameOfAmortisator4784), true);
     }

//    @After
//    public void deleteAddedFromBasket() {
//        basketWaitForPayment.clickOnButtonDelete();
//    }
}

