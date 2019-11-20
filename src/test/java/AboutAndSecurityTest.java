import Listeners.TestAllureListener;
import Pages.*;
import Utils.PropertyManager;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})

public class AboutAndSecurityTest extends BasePage {

    @Test(priority = 1, description = "שאילתה של אודות ואבטחת מידע" )
    public void AboutAndSecurityPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getCancelCyclicTransferPageTestId(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("אודות ואבטחת מידע",driver);
        Thread.sleep(3000);

}
    }