import Listeners.TestAllureListener;
import Pages.*;
import Utils.PropertyManager;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})
public class TwoGoCardPageTest extends BasePage {

    @Test(priority = 1, description = "טעינת כרטיס 2go")
    public void Charge2GOCards() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TwoGoCardPage go =new TwoGoCardPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getTwoGoCardPageTestId(), PropertyManager.getInstance().getTwoGoCardPageTestPass(), PropertyManager.getInstance().getTwoGoCardPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();
        dashbordPage.allaction.click();
        Utils.scrollToText("טעינת 2go",driver);
        go.type_Amount("25");
        driver.hideKeyboard();
        go.click_ContinueButton_1();
        Utils.waitForElement(driver,go.Confirmation_Amount,3);
        go.click_ContinueButton_2();
        go.click_ScreenCaptureButton();
    }
}