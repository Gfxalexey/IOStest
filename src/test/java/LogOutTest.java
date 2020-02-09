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
import io.appium.java_client.ios.IOSDriver;
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
        Thread.sleep(3000);
        System.out.println(dashbordPage.balanceOfAccount.getText());
        dashbordPage.balanceOfAccount.click();
//        List<MobileElement> els2 = (List<MobileElement>) ((IOSDriver) driver).findElementsByIosClassChain("**/XCUIElementTypeWindow[1]/**/XCUIElementTypeButton[9]");
//        System.out.println(els2.get(0).getText());
//        els2.get(0).click();
        Thread.sleep(3000);

//        System.out.println(dashbordPage.balanceOfAccount.getText());
//        dashbordPage.click_HamburgerButton();
//        Utils.scrollToTextIOS("יציאה",driver);
//        dashbordPage.exitButton.click();

    }
    @Test(description = " מהחשבון")
    @Ignore
    public void snap() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        SnapshotPage snap=new SnapshotPage(driver);
        Utils.DragElement_point_to_point(186,743,267,181,5,driver);
        Thread.sleep(3000);
        System.out.println(snap.snap_Balance.getText());

    }
}
