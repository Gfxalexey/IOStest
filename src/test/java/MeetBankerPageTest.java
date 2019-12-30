import Pages.*;
import Pages.Utils;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;


@Listeners({TestAllureListener.class})

public class MeetBankerPageTest extends BasePage {

    @Test(priority = 1, description = "קביעת פגישה עם יועץ")
    public void Start_Meet_with_Investment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        MeetBankerPage meet = new MeetBankerPage(driver);
        loginPage.EnterButton.click();
//        Utils.TapCordinate(driver,85,448);
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        Utils.waitForbanner(driver, dashbordPage.Banner, 1);
        dashbordPage.click_HamburgerButton();
        dashbordPage.click_meetingBankerButton();
        meet.click_Meet_Banker();
        meet.click_continueButton();
        meet.credit_inquiry.click();
        meet.click_continueButton();
        meet.day.click();
        meet.click_continueButton();
        Utils.waitForElement(driver,meet.continueButton,10);
        meet.click_continueButton();
        meet.type_text("בדיקות אוטומציה");
        meet.AcceptFinish.click();
        System.out.println(meet.pgisha.getText());



    }

    @Test(priority = 3, description = "ביטול פגישה עם בנקאי" )
    public void Cancel_Meet_with_Investment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        MeetBankerPage meet = new MeetBankerPage(driver);
        loginPage.EnterButton.click();
        Utils.TapCordinate(driver,85,448);
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        Utils.waitForbanner(driver, dashbordPage.Banner, 1);
        dashbordPage.click_HamburgerButton();
        dashbordPage.click_meetingBankerButton();
        meet.click_cancel_meet_banker_Button();
        meet.click_PopupPositiveButton();

    }
}