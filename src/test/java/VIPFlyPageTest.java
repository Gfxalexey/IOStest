import Pages.*;
import Utils.PropertyManager;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listeners.TestAllureListener;

@Listeners({TestAllureListener.class})

    public class VIPFlyPageTest extends BasePage {

    @Test(priority = 1, description = "בדיקת זכאות לנתבג ללקוח שאין לו")
    public void Check_VIP() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        VIPFlyPage vip = new VIPFlyPage(driver);
        loginPage.EnterButton.click();
        Utils.TapCordinate(driver,85,448);
        loginPage.loginsucces(PropertyManager.getInstance().getVIPFlyPageTestId(), PropertyManager.getInstance().getVIPFlyPageTestPass(), PropertyManager.getInstance().getVIPFlyPageTestPass());
        loginPage.EnterButton.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();

        Utils.scrollToTextIOS("חדש: מפתח VIP נתב/״ג",driver);
        dashbordPage.VIP.click();
        vip.click_join_vip();
        vip.click_ContinueButton();
        System.out.println(vip.firstSubTitle.getText());
//        Assert.assertEquals("החודש אין לך זככים לך בחודש הבאאות, אבל הזמן טס... מח",vip.firstSubTitle.getText());
        Assert.assertEquals("איך זה עובד?",vip.actionLink.getText());


    }
}