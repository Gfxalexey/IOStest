import Pages.*;
import Pages.Utils;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;

@Listeners({TestAllureListener.class})
public class CashWithdrawalPageTest extends BasePage {

    @Test(priority = 0, description = "משיכת מזומן ללא כרטיס")
    public void CashWithdrawal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CashWithdrawalPage cashWithdrawalPage = new CashWithdrawalPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);

//            loginPage.AllowButton.click();
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getCashWithdrawalPageTestId(), PropertyManager.getInstance().getCashWithdrawalPageTestPass(), PropertyManager.getInstance().getCashWithdrawalPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver,dashbordPage.Banner,3);

//        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
//            driver.navigate().back();
//        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.cashWithdrawalButton.click();
        Utils.waitForElement(driver, cashWithdrawalPage.ContinueButton, 10);
        cashWithdrawalPage.ContinueButton.click();
        cashWithdrawalPage.ContinueButton.click();
        Utils.waitForElement(driver, cashWithdrawalPage.ContinueButton, 10);
        cashWithdrawalPage.ContinueButton.click();
        cashWithdrawalPage.ScreenCaptureButton.click();
        //    cashWithdrawalPage.AllowButton.click();

    }

    @Test(priority = 1, description = "ביטול_מזומן_ללא_כרטיס")
    public void CancelCashWithdrawal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CancelCashPage cancelCashPage = new CancelCashPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getCashWithdrawalPageTestId(), PropertyManager.getInstance().getCashWithdrawalPageTestPass(), PropertyManager.getInstance().getCashWithdrawalPageTestPass());

//        loginPage.loginsucces("320555683", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver,dashbordPage.Banner,3);
//        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size() > 0) {
//            driver.navigate().back();
//        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.cashWithdrawalButton.click();
        cancelCashPage.click_CancelButton();
        cancelCashPage.click_AcceptButton();
    }
}
//        @AfterMethod
//        public void teardown() {
//            driver.closeApp();
//        }
//    }