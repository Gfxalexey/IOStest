import Listeners.TestAllureListener;
import Pages.*;
import Utils.PropertyManager;
import org.openqa.selenium.By;
import org.testng.Assert;
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
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getTwoGoCardPageTestId(), PropertyManager.getInstance().getTwoGoCardPageTestPass(), PropertyManager.getInstance().getTwoGoCardPageTestPass());
        Utils.waitForbanner(driver, dashbordPage.Banner, 3);
        dashbordPage.click_HamburgerButton();
        dashbordPage.allaction.click();
        Utils.scrollToTextIOS("טעינת 2go",driver);
        dashbordPage.click_togo();
        go.click_card_2go();
        go.click_ContinueButton();
        Assert.assertEquals("סכום טעינה",go.amount_text_head.getText());
//        Assert.assertEquals("הסכום המרבי בכרטיס לא יעלה על 450 ש/״ח",go.text_max_amount.getText());
        go.type_Amount("25");
        go.click_Next_board();
        go.click_ContinueButton_2();
        go.click_ScreenCaptureButton();
    }
}