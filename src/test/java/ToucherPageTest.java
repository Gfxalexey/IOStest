import Pages.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})

   public class ToucherPageTest extends BasePage {


    @Test(priority = 1, description = "הצטרפות לטאצ'ר")
    public void CashWithdrawal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        ToucherPage toucher = new ToucherPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getToucherPageTestId(), PropertyManager.getInstance().getToucherPageTestPass(), PropertyManager.getInstance().getToucherPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("טאצ'ר - חשבון דיגיטלי",driver);
        toucher.click_join();
        toucher.click_ContinueButton_1();
        toucher.type_Email("appium@gmail.com");
        driver.hideKeyboard();
        toucher.click_ContinueButton_2();
        Utils.waitForElement(driver,toucher.amortizationSchedule,5);
        toucher.click_ScreenCaptureButton();
    }
}