import Pages.*;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import Listeners.TestAllureListener;
import Utils.PropertyManager;
import Utils.PropertyManager;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

@Listeners({TestAllureListener.class})
public class WithdrawalOfDepositTest extends BasePage{

    @Test(priority = 1,description = "משיכה_מפקדון")
    @Ignore
    public void WithdrawalOfDeposit () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        WithdrawalOfDepositPage dep = new WithdrawalOfDepositPage(driver);
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

    @Test(priority = 1,description = "משיכה_מפקדון")
    public void WithdrawalOfDeposit_ios () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        WithdrawalOfDepositPage dep = new WithdrawalOfDepositPage(driver);
        AllActionPage all=new AllActionPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getWithdrawalOfDepositTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,1);
        dashbordPage.click_HamburgerButton();
        dashbordPage.clickallaction();
        Utils.scrollScreenAll(driver,5,all.withdrawalDeposit);
        dep.primon.click();
        dep.date_primon.click();
        dep.clickmeshihaButton();
        Utils.TapCordinate(driver,189,315);  //משיכה בתחנה קרובה
        dep.clickсontinueButton();
        dep.type_Amoun("250");
        dep.clickсontinueButton1();
        Utils.waitForElement(driver,dep.ScreenCaptureButton,10);
        dep.clickScreenCaptureButton();

    }
   }
