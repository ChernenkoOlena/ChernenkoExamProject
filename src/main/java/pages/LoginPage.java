package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{
    @FindBy(xpath = ".//*[@class='content']//input[@type='text']")
    private WebElement inputLogin;

    @FindBy(xpath = ".//input[@type='password']")
    private WebElement inputPassword;

    @FindBy(xpath =".//input[@type='submit']" )
    private WebElement buttonSubmit;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage(){
        try {
            webDriver.get("http://kemp.ua/index.php?route=account/login");
            logger.info("LoginPage was opened");
        }catch (Exception e){
            logger.error("Can not open LoginPage");
            Assert.fail("Can not open LoginPage");
        }
    }

    public void enterLogin(String login){
        actionsWithOurElements.enterTextIntoElement(inputLogin,login);
    }

    public void enterPassword(String password){
        actionsWithOurElements.enterTextIntoElement(inputPassword,password);
    }

    public void clickSubmitButton(){
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void userLogin(String login, String pass) {
        openPage();
        enterLogin(login);
        enterPassword(pass);
        clickSubmitButton();
    }
}
