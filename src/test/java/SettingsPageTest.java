import Pages.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Properties;

@Listeners({TestAllureListener.class})


public class SettingsPageTest extends BasePage {



    @Test(description = "הצטרפות+הצגה של מבט זריז")
    public void snapshot() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        SettingsPage set=new SettingsPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getSettingsPageTestPass());
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();
        dashbordPage.settingsButton.click();
        set.click_mabatZariz();
        Utils.waitForElement(driver,set.ServiceTermsAccepted_mabat_zariz,3);
        set.ServiceTermsAccepted_mabat_zariz.click();
        set.ServiceConfirmButton.click();
        set.backToMainSetting.click();
        set.exitFromMainSetting.click();
        dashbordPage.click_HamburgerButton();
        Utils.scrollToTextIOS("יציאה",driver);
        dashbordPage.exitButton.click();
        Thread.sleep(5000);
        Utils.DragElement_point_to_point(186,743,267,181,5,driver);
//


//        Utils.DragElementIOS(loginPage.login_snapshot_button,loginPage.EnterButton,driver,3);
//        Utils.waitForElement(driver,loginPage.snapshotOshAmount,5);

    }
}