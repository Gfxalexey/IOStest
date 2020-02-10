import Pages.*;
import Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.PropertyManager;

public class SnapshotPageTest extends BasePage {

    @Test(description = "הצטרפות למבט זריז ופתיחת מבט זריז כולל אימות נתונים")
    public void snap() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        SnapshotPage snap = new SnapshotPage(driver);
        SettingsPage set=new SettingsPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        String Balance = dashbordPage.balanceOfAccount.getText();
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
        Utils.waitForElement(driver,loginPage.EnterButton,1);
        Utils.DragElement_point_to_point(186, 743, 267, 181, 2, driver);
        Utils.waitForElement(driver,snap.snap_Balance,1);
        Assert.assertEquals(Balance,dashbordPage.balanceOfAccount.getText());

    }
}