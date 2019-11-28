import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import Listeners.TestAllureListener;

import static java.time.Duration.ofSeconds;

@Listeners({TestAllureListener.class})

public class OpenDepositTest extends BasePage {

    @Test(priority = 0,description = "הפקדה לפיקדון חדש")
    public void Deposit_to_deposit() throws InterruptedException {
        driver.manage (). timeouts (). implicitlyWait (0, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        OpenDepositPage openDepositPage = new OpenDepositPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);

        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();

        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.click_openDepositButton();
        openDepositPage.type_amount("250");
        openDepositPage.NextButton.click();
        openDepositPage.typeDeposit();
        openDepositPage.NextButton2.click();
        openDepositPage.typeRate.click();
        openDepositPage.NextButton2.click();
        Utils.waitForElement(driver,openDepositPage.ConfirmationAmount,10);
        openDepositPage.clickFinishButton();
        openDepositPage.ScreenCaptureButton.click();
   }
//    @AfterMethod
//    public void teardown(){
//        driver.closeApp();
//    }
}
