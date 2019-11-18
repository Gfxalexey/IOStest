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

public class QuickTransOfLoginPageTest extends BasePage {

    @Test(priority = 0,description = "ביצוע העברה מתפריט מהיר")
    public void QuickTransOfLogin () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransfersPage transfersPage=new TransfersPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("יציאה",driver);
        Utils.waitForElement(driver,loginPage.snapshot,10);
        loginPage.clickquicktransfer();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        transfersPage.typeName("shalom");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        transfersPage.accountnum.sendKeys("532142");
        transfersPage.typeNumAccount("31","109");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        transfersPage.amount.click();
        transfersPage.amount2.sendKeys("20");
        driver.navigate().back();
        transfersPage.clickContinueButton();
//        Thread.sleep(2000);
        if(driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\n")).size()>0){
            transfersPage.clickyesPopUp();
        }
        if(driver.findElements(By.id("com.ideomobile.discount:id/error_positive_button")).size()>0){
            transfersPage.clickyesPopUp();
        }
        Utils.waitForElement(driver,transfersPage.AcceptButton,10);
        transfersPage.clickAcceptButton();
        transfersPage.clickCaptureButton();
    }



}
