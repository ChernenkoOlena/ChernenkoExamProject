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
        amortisatoryOpelPage.getCurrentUrl();
        amortisatoryOpelPage.addNewFromSubMenuAmortisatoryGood4784();
        subAmortisatoryOpelPage.getCurrentUrl();
        subAmortisatoryOpelPage.clickOnButtonAddToWishList();
        subAmortisatoryOpelPage.clickOnMenuWishList();
        wishListPage.getCurrentUrl();

//        checkAC

        wishListPage.clickOnButtonRemoveWishList();
        wishListPage.getCurrentUrl();

    }
}
