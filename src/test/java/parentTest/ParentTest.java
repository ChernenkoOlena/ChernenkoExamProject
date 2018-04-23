package parentTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver;
    protected LoginPage loginPage;
    protected AccountPage accountPage;
    protected HomePage homePage;
    protected MainPage mainPage;
    protected OpelPage opelPage;
    protected AmortisatoryOpel amortisatoryOpel;
    protected SubAmortisatoryOpel subAmortisatoryOpel;
    protected BasketWaitForPayment basketWaitForPayment;
    protected LogOutPage logOutPage;

    Logger logger = Logger.getLogger(getClass());

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        loginPage = new LoginPage(webDriver);
        accountPage = new AccountPage(webDriver);
        homePage = new HomePage(webDriver);
        mainPage = new MainPage(webDriver);
        opelPage = new OpelPage(webDriver);
        amortisatoryOpel = new AmortisatoryOpel(webDriver);
        subAmortisatoryOpel = new SubAmortisatoryOpel(webDriver);
        basketWaitForPayment = new BasketWaitForPayment(webDriver);
        logOutPage = new LogOutPage(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }


    protected void checkAC(String message, boolean actual, boolean expected) {
        if(!(actual == expected)){
            logger.error("AC failed: " + message);
        }
        Assert.assertEquals(message, expected, actual);
    }
}
