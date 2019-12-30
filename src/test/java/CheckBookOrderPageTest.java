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
import Utils.PropertyManager;
@Listeners({TestAllureListener.class})

public class CheckBookOrderPageTest  extends  BasePage {

    @Test(description = "הזמנת_פנקסי_שיקים")
    public void Order_Checkbook() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CheckBookOrderPage checks = new CheckBookOrderPage(driver);
        AllActionPage all = new AllActionPage(driver);
        loginPage.EnterButton.click();
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getCheckBookOrderPageTestId(), PropertyManager.getInstance().getCheckBookOrderPageTestPass(), PropertyManager.getInstance().getCheckBookOrderPageTestPass());
        Utils.waitForbanner(driver,dashbordPage.Banner,3);
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickallaction();
        all.orderChecksBook.click();
        checks.click_nextButton();
        checks.click_nextButton();
        checks.click_nextButton();
        checks.click_accept_order_Button();
        checks.clickscreenCaptureButton();


    }

}
