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
        AllActionPage all=new AllActionPage(driver);
        loginPage.EnterButton.click();
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getCancelCyclicTransferPageTestId(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,5);
        dashbordPage.click_HamburgerButton();
        dashbordPage.allaction.click();
//        all.cancelhokButton.click();
        Utils.scrollScreenAll(driver,5,all.cancelhokButton);
//        Utils.scrollToText("ביטול העברה עתידית",driver);
        cancel.standingOrderCancel.click();
        cancel.ContinueButton.click();
        Utils.waitForElement(driver,cancel.gagola,10);
        cancel.AcceptContinueButton.click();
        Utils.waitForElement(driver,cancel.ScreenCaptureButton,2);
        cancel.ScreenCaptureButton.click();



    }
}