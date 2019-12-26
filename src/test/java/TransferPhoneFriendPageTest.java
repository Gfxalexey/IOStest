import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;
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

