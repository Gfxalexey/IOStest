//TradePageTest

import Pages.*;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Properties;
import Listeners.TestAllureListener;
import  Utils.PropertyManager;
@Listeners({TestAllureListener.class})

public class TradePageTest extends BasePage{

    @Test(priority = 1,description = "צפייה בדשבורד של שוק ההון")
    public void Trade_Lobby() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TradePage tradePage=new TradePage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("8105496", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_TradeLobby();
        Assert.assertEquals("תשואת תיק נומינלית מתחילת שנה:", tradePage.securitiesSummaryFragment.getText());
        Assert.assertEquals("שווי תיק",tradePage.summary_fragment.getText());
    }
    @Test(priority = 0 , description = "חיפוש נייר בשוק ההון")
    public void Trade_Search() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TradePage tradePage = new TradePage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);

        loginPage.EnterButton.click();
        Thread.sleep(1000);
//        loginPage.loginsucces("8105496", "1q1q1q", "1q1q1q");
        loginPage.loginsucces(PropertyManager.getInstance().getTradePageTestId(), PropertyManager.getInstance().getTradePageTestPass(), PropertyManager.getInstance().getTradePageTestPass());
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_TradeLobby();
        tradePage.click_stocksSearchButton();
        tradePage.securitiesSearch.click();
        driver.hideKeyboard ();
        tradePage.securitiesSearch.sendKeys("TEVA");
        tradePage.securitiesSearch.click();
//        tradePage.securitiesSearch.sendKeys(Keys.);



        Thread.sleep(5000);


    }
    @Test(priority = 2, description = "צפיה בנייר מתוך התיק")
    public void Trade_Stok_Details() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TradePage tradePage = new TradePage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);

        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("4357760", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_TradeLobby();
        Thread.sleep(1000);
        Utils.swipeDown(4, driver, "טבע", 0);
    }
    @Test(priority = 5,description = "ביצוע של קניית מנייה מתיק הלקוח ")
    public void Trade_Buy_Stok() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TradePage tradePage = new TradePage(driver);
        StockPage stockPage=new StockPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("4357760", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_TradeLobby();
        Thread.sleep(1000);
        Utils.swipeDown(4, driver, "טבע", 0);
        tradePage.click_buy_button();
        stockPage.TradeStage.click();
        Utils.scrollToText("טרום פתיחה",driver);
        String element = stockPage.SecurityOperationDetailsCurrentPrice.getText();
        stockPage.type_RateLimit(element);
        stockPage.type_units("1");

        driver.hideKeyboard();
        stockPage.click_ContinueButton();
        Utils.waitForElement(driver,stockPage.ContinueButton,10);
        stockPage.click_ContinueButton();
        stockPage.click_screenCaptureButton();
    }
    @Test(priority = 4,description = "נתוני מסחר של מנייה ")
    public void Stok_Details() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TradePage tradePage = new TradePage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("4357760", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_TradeLobby();
        Thread.sleep(1000);
        Utils.swipeDown(4, driver, "טבע", 0);
        tradePage.click_securityPortfolio();
    }
//    @AfterMethod
//    public void teardown(){
//        driver.closeApp();
//    }
}
