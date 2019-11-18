import Pages.BasePage;
import Pages.*;
import Pages.Utils;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;


@Listeners({TestAllureListener.class})
public class DidiPageTest extends BasePage {


    @Test(priority = 1, description = "שיחה עם דידי ומעבר לעו")
    public void DIDI_v1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        DidiPage didi = new DidiPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 1);
        didi.type_Question("שלום");
        Assert.assertEquals("תודה ששאלת, עוד יום יפה בדיסקונט :-). יש לך שאלה בענייני החשבון שלך או בנושא בנקאי כלשהו? אשמח לעזור.", didi.AnswerText.getText());
        Thread.sleep(1000);
        didi.type_Question("עוש");
        Thread.sleep(1000);
        didi.botBalanceAllTransactions.click();
        Utils.waitForElement(driver, didi.botBalanceamount, 5);


    }

    @Test(priority = 2, description = "שיחה על כרטיסי אשראי")
    public void DIDI_v2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        DidiPage didi = new DidiPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 1);

        didi.type_Question("שלום");
        Assert.assertEquals("תודה ששאלת, עוד יום יפה בדיסקונט :-). יש לך שאלה בענייני החשבון שלך או בנושא בנקאי כלשהו? אשמח לעזור.", didi.AnswerText.getText());
        didi.type_Question("עוש");
        didi.botBalanceAllTransactions.click();
        Utils.waitForElement(driver, didi.botBalanceamount, 5);
        dashbordPage.Dashboard_Home_Button.click();
        didi.type_Question("כרטיסי אשראי");
        didi.botActionButton.click();
        Thread.sleep(2000);


    }

    @Test(priority = 1, description = "שיחה עם דידי ומעבר לעו")
    public void DIDI_v3() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        DidiPage didi = new DidiPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getMeetBankerPageTestId(), PropertyManager.getInstance().getMeetBankerPageTestPass(), PropertyManager.getInstance().getMeetBankerPageTestPass());
        dashbordPage.TutorialSkip.click();
        Utils.waitForbanner(driver, dashbordPage.Banner, 1);
        didi.type_Question("שלום");
//        Assert.assertEquals("תודה ששאלת, עוד יום יפה בדיסקונט :-). יש לך שאלה בענייני החשבון שלך או בנושא בנקאי כלשהו? אשמח לעזור.", didi.AnswerText.getText());


    }
}