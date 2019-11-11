import Pages.*;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import Listeners.TestAllureListener;
import Utils.PropertyManager;
import Utils.PropertyManager;

@Listeners({TestAllureListener.class})
public class WithdrawalOfDepositTest extends BasePage{

    @Test(priority = 1,description = "משיכה_מפקדון")
    public void WithdrawalOfDeposit () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        WithdrawalOfDepositPage dep = new WithdrawalOfDepositPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getWithdrawalOfDepositTestId(), PropertyManager.getInstance().getWithdrawalOfDepositTestPass(), PropertyManager.getInstance().getWithdrawalOfDepositTestPass());

        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.clickallaction();
        Utils.swipeDown(1,driver,"משיכה מפיקדון",0);
        Utils.swipeDown(2,driver,"פיקדון פרימון עם תחנות יציאה שבועיות",0);
        Utils.swipeDown(1,driver,"פיקדון פרימון עם תחנות יציאה שבועיות",1);
        dep.clickmeshihaButton();
        dep.clickmeshihaNow();
        dep.clickсontinueButton();
        dep.type_Amoun("250");
        Utils.waitForElement(driver,dep.ConfirmationAmount,10);
        dep.clickсontinueButton1();
        Utils.waitForElement(driver,dep.ScreenCaptureButton,10);
        dep.clickScreenCaptureButton();

    }


   }
