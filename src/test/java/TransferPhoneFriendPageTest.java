import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.rmi.CORBA.Util;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;

public class TransferPhoneFriendPageTest extends BasePage {


    @Test(description = "שליחת_כסף_לחבר")
    public void Send_Money_Friend() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransferPhoneFriendPage transferPhoneFriendPage = new TransferPhoneFriendPage(driver);
//        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        Utils.wait_and_click_Element(driver,dashbordPage.bannerImageMainButtonX,1);
//        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
//            driver.navigate().back();
//        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.clicktransferFriendCashButton();
        transferPhoneFriendPage.SelectFromPhone();
//        transferPhoneFriendPage.cliclpermissionallowbutton();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        dashbordPage.HamburgerButton.click();
        dashbordPage.clicktransferFriendCashButton();
        transferPhoneFriendPage.SelectFromPhone();
        transferPhoneFriendPage.kobiPhone.click();
        Utils.waitForElement(driver, transferPhoneFriendPage.ContinueButton, 20);
        transferPhoneFriendPage.clickContinueButton();
        transferPhoneFriendPage.clickContinueButton();
        transferPhoneFriendPage.type_amoun("20");
        driver.navigate().back();
        transferPhoneFriendPage.clickContinueButton();
        Utils.waitForElement(driver, transferPhoneFriendPage.ContinueButton, 20);
        transferPhoneFriendPage.clickContinueButton();
        transferPhoneFriendPage.clickCaptureButton();
    }
}

