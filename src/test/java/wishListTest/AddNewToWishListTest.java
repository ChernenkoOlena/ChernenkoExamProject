package wishListTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewToWishListTest extends ParentTest {
    @Test
       public void addNewToWishListTest(){
        loginPage.userLogin("helen.cher6@gmail.com", "vesna18");
        accountPage.getCurrentUrl();
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnButtonHomePage();
        homePage.checkCurrentUrl();
        homePage.clickOnMenuOpel();
        opelPage.getCurrentUrl();
        opelPage.clickOnSubMenuAmortisatory();
        amortisatoryOpel.getCurrentUrl();
        amortisatoryOpel.addNewFromSubMenuAmortisatoryGood4784();
        subAmortisatoryOpel.getCurrentUrl();
        subAmortisatoryOpel.clickOnButtonAddToWishList();
        subAmortisatoryOpel.clickOnMenuWishList();
        wishListPage.getCurrentUrl();

//        checkAC

        wishListPage.clickOnButtonRemoveWishList();
        wishListPage.getCurrentUrl();

    }
}
