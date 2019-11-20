import Pages.*;
import org.testng.annotations.Listeners;
import Utils.PropertyManager;
import Listeners.TestAllureListener;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})

public class CancelCyclicTransferPageTest extends BasePage {

    @Test(priority = 1, description = "משיכת מזומן ללא כרטיס")
    public void CashWithdrawal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CancelCyclicTransferPageTest cancel = new CancelCyclicTransferPageTest(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getCancelCyclicTransferPageTestId(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();
        dashbordPage.allaction.click();
        Utils.scrollToText("");

    }
}