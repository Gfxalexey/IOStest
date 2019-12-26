import Listeners.TestAllureListener;
import Pages.*;
import Utils.PropertyManager;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})

public class AboutAndSecurityTest extends BasePage {

    @Test(priority = 1, description = "שאילתה של אודות ואבטחת מידע" )
    public void AboutAndSecurityPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        AboutAplicationPage about =new AboutAplicationPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        loginPage.EnterButton.click();
        //        loginPage.loginsucces(PropertyManager.getInstance().getCancelCyclicTransferPageTestId(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass(), PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,1);
        dashbordPage.click_HamburgerButton();
        Utils.scrollToTextIOS("יציאה",driver);
        dashbordPage.about_Us_security.click();
        Assert.assertEquals("03-9439191",about.number.getText());
//        Assert.assertEquals("א'-ה' בין השעות 08:00 – 19:00 ו' וערבי חג בין השעות 08:00 – 13:00 ",about.activityTime.getText());
//        Assert.assertEquals("התקשר לתמיכה",about.callPhone.getText());


}
    }