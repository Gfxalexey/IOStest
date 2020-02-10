import Pages.*;
import Utils.Utils;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listeners.TestAllureListener;
@Listeners({TestAllureListener.class})

public class TransferPhoneFriendPageTest extends BasePage {


    @Test(description = "שליחת_כסף_לחבר")
    public void Send_Money_Friend()  {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransferPhoneFriendPage transferPhoneFriendPage = new TransferPhoneFriendPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,1);
        dashbordPage.HamburgerButton.click();
        dashbordPage.clicktransferFriendCashButton();
        transferPhoneFriendPage.SelectFromPhone();
        transferPhoneFriendPage.kobiPhone.click();
        transferPhoneFriendPage.clickContinueButton();
        transferPhoneFriendPage.clickContinueButton();
        transferPhoneFriendPage.type_amoun("20");
        transferPhoneFriendPage.board_continueButton.click();
        transferPhoneFriendPage.click_Accept_ContinueButton();
        transferPhoneFriendPage.clickCaptureButton();

    }
}

