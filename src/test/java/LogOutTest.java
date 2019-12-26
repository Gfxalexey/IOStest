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
        import Utils.PropertyManager;
@Listeners({TestAllureListener.class})

public class LogOutTest extends BasePage  {

    @Test(description = "יצאה מהחשבון")
    public void Loguot_Test() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        loginPage.EnterButton.click();
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,1);
        dashbordPage.click_HamburgerButton();
        Utils.scrollToTextIOS("יציאה",driver);
    }

}
