package wishListTest;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class AddNewToWishListTest extends ParentTest {
 final String nameOfNewGood4784 = "Амортизатор  крышки багажника Opel Ascona C  512-200mm 450N";

 @Test
       public void addNewToWishListTest(){
        loginPage.userLogin("helen.cher6@gmail.com", "vesna18");
        accountPage.getCurrentUrl();
        accountPage.checkAvatarIsPresent();
        accountPage.clickOnButtonHomePage();
        homePage.checkCurrentUrl();
        homePage.clickOnMenuWishesList();
        wishListPage.getCurrentUrl();
        wishListPage.deletingAllGoodsWithName(nameOfNewGood4784);
        wishListPage.clickOnMenuHomePage();
        homePage.getCurrentUrl();
        homePage.clickOnMenuOpel();
        opelPage.getCurrentUrl();
        opelPage.clickOnSubMenuAmortisatory();
        amortisatoryOpelPage.getCurrentUrl();
        amortisatoryOpelPage.addNewFromSubMenuAmortisatoryGood4784();
        subAmortisatoryOpelPage.getCurrentUrl();
        subAmortisatoryOpelPage.clickOnButtonAddToWishList();
        subAmortisatoryOpelPage.clickOnMenuWishList();
        wishListPage.getCurrentUrl();

        checkAC("New Wish wasn't added", wishListPage.isNewWishAdded(nameOfNewGood4784), true );
    }

 @After
 public void deleteNewWish(){
  wishListPage.deletingAllGoodsWithName(nameOfNewGood4784);
  }

 }





