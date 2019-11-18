import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import Pages.BasePage;
import Pages.DashbordPage;
import Pages.LoginPage;
import Pages.OpenDepositPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import Listeners.TestAllureListener;

@Listeners({TestAllureListener.class})

public class QuickwithdrawalOfLoginPageTest extends BasePage {



    @Test(description = "משיכת_מזומן_מדף_לוגין")
    public void QuickCash() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CashWithdrawalPage cashWithdrawalPage = new CashWithdrawalPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("יציאה",driver);
        loginPage.clickquickwithdrawal();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        Utils.waitForElement(driver,cashWithdrawalPage.ContinueButton,10);
        cashWithdrawalPage.ContinueButton.click();
        cashWithdrawalPage.ContinueButton.click();
        Utils.waitForElement(driver,cashWithdrawalPage.ContinueButton,10);
        cashWithdrawalPage.ContinueButton.click();
        cashWithdrawalPage.ScreenCaptureButton.click();

    }


//    @AfterMethod
//    public void teardown(){
//        driver.closeApp();
//    }
}
