import Pages.*;
import Pages.Utils;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;

import javax.rmi.CORBA.Util;

@Listeners({TestAllureListener.class})

public class MeetBankerPageTest extends BasePage {

    @Test(description = "קביעת פגישה עם יועץ")

    public void Start_Meet_with_Investment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        MeetBankerPage meet =new MeetBankerPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver,dashbordPage.Banner,2);

//        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
//            driver.navigate().back();
//        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.click_meetingBankerButton();
        meet.click_Meet_with_Investment();
        Utils.waitForElement(driver,meet.Meet_with_Investment,3);
        meet.click_continueButton();
        driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).get(0);
        meet.click_continueButton2();
        Utils.waitForbanner(driver,meet.phone_titel,3);
        meet.click_continueButton3();
        meet.type_text("בדיקות אוטומציה");
        driver.hideKeyboard();
        meet.click_finish_continue();
        Utils.waitForElement(driver,meet.appointmentConfirmationCard,3);
        System.out.println(meet.appointmentConfirmationCard);




    }
}
