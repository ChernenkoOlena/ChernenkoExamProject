package wishListTest;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class AddNewToWishListTest extends ParentTest {
 final String nameOfNewGood4784 = "Амортизатор  крышки багажника Opel Ascona C  512-200mm 450N";
 final String login = "helen.cher6@gmail.com";
 final String pass = "vesna18";

 @Test
       public void addNewToWishListTest(){
        loginPage.userLogin(login, pass);
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





