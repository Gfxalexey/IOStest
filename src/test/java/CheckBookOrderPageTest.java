import Listeners.TestAllureListener;
import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Properties;

@Listeners({TestAllureListener.class})

public class CheckBookOrderPageTest  extends  BasePage {

    //    AppiumDriver<MobileElement> driver;
//    public Properties prop;
//    public BasePage basePage;
//
//
//    @BeforeMethod
//
//    public void setup() throws MalformedURLException {
//        BasePage basePage = new BasePage();
//        driver=basePage.initialize_driver();
//        prop = basePage.initialize_Properties();
//
//    }
    @Test(description = "הזמנת_פנקסי_שיקים")
    public void Order_Checkbook() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CheckBookOrderPage checks = new CheckBookOrderPage(driver);
        AllActionPage all = new AllActionPage(driver);
//        loginPage.AllowButton.click();
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);

        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("4806006", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver,dashbordPage.Banner_X_Button,3);

//        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
//            driver.navigate().back();
//        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickallaction();
        Utils.scrollScreen(driver);
        all.orderChecksBook.click();
        Thread.sleep(1000);
        Utils.waitForElement(driver, checks.nextButton, 10);
        checks.nextButton.click();
        checks.typeBranche("34");
        checks.clicknextButton();
        Utils.waitForElement(driver, checks.nextButton, 10);
        checks.nextButton.click();
        Utils.waitForElement(driver, checks.nextButton, 10);
        checks.nextButton.click();
        checks.clickscreenCaptureButton();


    }

}
//        @AfterMethod
//        public void teardown () {
//            driver.closeApp();
//        }
//    }
