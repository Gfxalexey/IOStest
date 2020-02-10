import Pages.*;
import Utils.Utils;
import Pages.BasePage;
        import Pages.DashbordPage;
        import Pages.LoginPage;
import org.testng.annotations.*;

import Listeners.TestAllureListener;
        import Utils.PropertyManager;
@Listeners({TestAllureListener.class})

public class LogOutTest extends BasePage  {

    @Test(description = "יצאה מהחשבון")

    public void Loguot_Test() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        Utils.scrollIos("right",driver);
        System.out.println(driver.getPageSource());

//        List<MobileElement> els2 = (List<MobileElement>) ((IOSDriver) driver).findElementsByIosClassChain("**/XCUIElementTypeWindow[1]/**/XCUIElementTypeButton[9]");
//        System.out.println(els2.get(0).getText());
//        els2.get(0).click();

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
