import Pages.*;
import Pages.Utils;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;

@Listeners({TestAllureListener.class})
public class CashWithdrawalPageTest extends BasePage {

    @Test(priority = 1, description = "משיכת מזומן ללא כרטיס")
    public void CashWithdrawal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CashWithdrawalPage cashWithdrawalPage = new CashWithdrawalPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass( PropertyManager.getInstance().getCashWithdrawalPageTestPass());
        Utils.waitForbanner(driver,dashbordPage.Banner,3);
        dashbordPage.click_HamburgerButton();
        dashbordPage.cashWithdrawalButton.click();
        Utils.waitForElement(driver, cashWithdrawalPage.ContinueButton, 10);
        cashWithdrawalPage.click_ContinueButton();
        cashWithdrawalPage.click_ContinueButton();
        Utils.waitForElement(driver, cashWithdrawalPage.ApprovalButton, 10);
        cashWithdrawalPage.click_ApprovalButton();
        cashWithdrawalPage.ScreenCaptureButton.click();

    }

    @Test(priority = 2, description = "ביטול_מזומן_ללא_כרטיס")
    public void CancelCashWithdrawal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CancelCashPage cancelCashPage = new CancelCashPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getCashWithdrawalPageTestPass());
        Utils.waitForbanner(driver,dashbordPage.Banner,3);
        dashbordPage.click_HamburgerButton();
        dashbordPage.cashWithdrawalButton.click();
        cancelCashPage.click_CancelButton();
        cancelCashPage.click_AcceptButton();
        Thread.sleep(2000);
    }
}
