import Pages.*;
import org.testng.annotations.Listeners;
import Utils.PropertyManager;
import Listeners.TestAllureListener;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})

public class CancelCyclicTransferPageTest extends BasePage {

    @Test(priority = 1, description = "ביטול הוראת קבע" )
    public void CancelCyclicTransfer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CancelCyclicTransferPage cancel = new CancelCyclicTransferPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getCancelCyclicTransferPageTestId(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();
        dashbordPage.allaction.click();
        Utils.scrollToText("ביטול העברה עתידית",driver);
        cancel.standingOrderCancel.click();
        cancel.ContinueButton.click();
        Utils.waitForElement(driver,cancel.gagola,10);
        cancel.ContinueButton.click();
        Utils.waitForElement(driver,cancel.ScreenCaptureButton,2);
        cancel.ScreenCaptureButton.click();



    }
}