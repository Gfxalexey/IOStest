import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;
import Listeners.TestAllureListener;
import Utils.PropertyManager;
@Listeners({TestAllureListener.class})
public class ForeignCurrencyConversionsPageTest extends BasePage {
    @Test(priority = 1,description = "המרת מטח משקל לדולר")
    public void Convers_ILS_To_USD() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        AllActionPage all=new AllActionPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        ForeignCurrencyConversionsPage foreign =new ForeignCurrencyConversionsPage(driver);
//        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getForeignCurrencyConversionsPageTestId(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass());
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.allaction.click();
        Utils.scrollToText("המרת",driver);
        foreign.click_ILSButton();
        foreign.click_continueButton();
        foreign.click_USDButton();
        foreign.click_continueButton2();
        if(driver.findElements(By.id("com.ideomobile.discount:id/fConversionChooseAccountExitBtn")).size()>0){
            foreign.XXX.click();
            foreign.bottomConfirmButton.click();
        }
        foreign.type_amountConverterButton("2");
        driver.navigate().back();
        foreign.click_continueButton3();
        if(driver.findElements(By.id("com.ideomobile.discount:id/error_positive_button")).size()>0){
            foreign.click_OKButton();
        }
        Utils.waitForElement(driver,foreign.continueButton,10);
        foreign.continueButton.click();
        foreign.ScreenCaptureButton.click();

    }
    @Test(priority = 0,description = "המרת מטח מדולר לשקל")
    public void Convers_USD_To_ILS() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        ForeignCurrencyConversionsPage foreign =new ForeignCurrencyConversionsPage(driver);
        AllActionPage all=new AllActionPage(driver);
//        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getForeignCurrencyConversionsPageTestId(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass());
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageMainButtonX")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.allaction.click();
        Utils.scrollToText("המרת ",driver);

        foreign.click_USDButton();
        foreign.click_continueButton();
        if(driver.findElements(By.id("com.ideomobile.discount:id/fConversionChooseAccountExitBtn")).size()>0){
            foreign.XXX.click();
            foreign.bottomConfirmButton.click();
        }
        foreign.click_ILSButton();
        foreign.click_continueButton2();
        foreign.type_amountConverterButton("2");
        driver.navigate().back();
        foreign.click_continueButton3();
        if(driver.findElements(By.id("com.ideomobile.discount:id/error_positive_button")).size()>0){
            foreign.click_OKButton();
        }
        Utils.waitForElement(driver,foreign.continueButton,15);
        foreign.continueButton.click();
        foreign.ScreenCaptureButton.click();

    }
}