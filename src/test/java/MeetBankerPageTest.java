import Pages.*;
import Pages.Utils;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;

import javax.rmi.CORBA.Util;

@Listeners({TestAllureListener.class})

public class MeetBankerPageTest extends BasePage {

    @Test(description = "קביעת פגישה עם יועץ",priority = 1)
    public void Start_Meet_with_Investment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        MeetBankerPage meet = new MeetBankerPage(driver);
        Utils.wait_and_click_Element(driver, loginPage.AllowButton, 3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 2);
        dashbordPage.click_HamburgerButton();
        dashbordPage.click_meetingBankerButton();
        meet.click_Meet_with_Investment();
        Utils.waitForElement(driver, meet.Meet_with_Investment, 3);
        meet.click_continueButton();
        MobileElement element = (MobileElement) driver.findElements(By.id("com.ideomobile.discount:id/appointmentsListItemMainLayout")).get(0);
        element.click();
        Utils.waitForElement(driver, meet.phone_titel, 2);
        meet.click_continueButton2();
        meet.click_continueButton3();
        driver.hideKeyboard();
        meet.type_text("בדיקות אוטומציה");
        meet.click_finish_continue();
        Utils.waitForElement(driver, meet.appointmentConfirmationCard, 3);
        System.out.println(meet.appointmentConfirmationCard);


    }

    @Test(description = "ביטול פגישה עם בנקאי" , priority = 2)

    public void Cancel_Meet_with_Investment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        MeetBankerPage meet = new MeetBankerPage(driver);
        Utils.wait_and_click_Element(driver, loginPage.AllowButton, 3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 2);
        dashbordPage.click_HamburgerButton();
        dashbordPage.click_meetingBankerButton();
        meet.click_cancel_meet_banker_Button();
        meet.click_PopupPositiveButton();
        meet.permission_allow_button2.click();
        Thread.sleep(1000);
    }
}