package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ParentPage{


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
        WebElement inputLogin = webDriver.findElement(By.xpath(".//*[@class='content']//input[@type='text']"));
        actionsWithOurElements.enterTextIntoElement(inputLogin,login);
    }

    public void enterPassword(String password){
        WebElement inputPassword = webDriver.findElement(By.xpath(".//input[@type='password']"));
        actionsWithOurElements.enterTextIntoElement(inputPassword,password);
    }
}
