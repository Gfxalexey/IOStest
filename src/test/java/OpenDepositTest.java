import Listeners.TestAllureListener;
import Pages.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utils.PropertyManager;
import java.util.concurrent.TimeUnit;

@Listeners({TestAllureListener.class})

public class OpenDepositTest extends BasePage {

    @Test(priority = 0,description = "הפקדה לפיקדון חדש")
    public void Deposit_to_deposit() throws InterruptedException {
        driver.manage (). timeouts (). implicitlyWait (0, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        OpenDepositPage openDepositPage = new OpenDepositPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getTransfersPageTestPass());
        loginPage.EnterButton.click();
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,1);
        dashbordPage.click_HamburgerButton();
        dashbordPage.click_openDepositButton();
        openDepositPage.type_amount("250");
        openDepositPage.NextButton.click();
        openDepositPage.typeDeposit();
        openDepositPage.NextButton2.click();
        openDepositPage.typeRate.click();
        openDepositPage.NextButton2.click();
        Utils.waitForElement(driver,openDepositPage.ConfirmationAmount,10);
        openDepositPage.clickFinishButton();
        openDepositPage.click_ScreenCaptureButton();
   }

}
