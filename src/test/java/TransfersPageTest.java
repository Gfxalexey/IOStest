import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;

import java.util.concurrent.TimeUnit;

@Listeners({TestAllureListener.class})
public class TransfersPageTest extends BasePage {


    @Test(description = "ביצוע העברה מחוץ לבנק")
    public void Transfer_ILS() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransfersPage transfersPage = new TransfersPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        loginPage.EnterButton.click();
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,1);
        dashbordPage.click_HamburgerButton();
        dashbordPage.clicktransferButton();
        transfersPage.type_Name("shalom");
        transfersPage.BoardNextButton.click();
        transfersPage.accountnum.sendKeys("532142");
        transfersPage.typeNumAccount("31","109");
        transfersPage.ContinueButton2.click();
        transfersPage.type_amount("20");
        transfersPage.Keyboard_next.click();
        Utils.wait_and_click_Element(driver,transfersPage.yesPopUp,2);
        transfersPage.clickAcceptButton();
        Utils.waitForElement(driver,transfersPage.CaptureButton,10);
        transfersPage.CaptureButton.click();
        Thread.sleep(1000);

    }

    @Test(description = "ביצוע העברה מעל 6000")
    @Ignore
    public void Transfer_ILS_With_OTP() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransfersPage transfersPage = new TransfersPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        loginPage.EnterButton.click();
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,1);
        dashbordPage.click_HamburgerButton();
        dashbordPage.clicktransferButton();
        transfersPage.type_Name("shalom");
        transfersPage.BoardNextButton.click();
        transfersPage.accountnum.sendKeys("532142");
        transfersPage.typeNumAccount("31","109");
        transfersPage.ContinueButton2.click();
        transfersPage.type_amount("6001");
        transfersPage.Keyboard_next.click();
        Utils.wait_and_click_Element(driver,transfersPage.yesPopUp,2);
        Utils.waitForElement(driver, transfersPage.otp_continue_button, 5);
        Assert.assertEquals("לקבלת קוד אימות בSMS", transfersPage.otp_continue_button.getText());
    }

    @Test(description = "ביצוע העברה מרשימת מוטבים")
    @Ignore
    public void Transfer_ILS_With_Beneficiary_List() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransfersPage transfersPage = new TransfersPage(driver);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Utils.wait_and_click_Element(driver, loginPage.AllowButton, 3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getTransfersPageTestId(),PropertyManager.getInstance().getTransfersPageTestPass(),PropertyManager.getInstance().getTransfersPageTestPass());
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.clicktransferButton();
        transfersPage.click_beneficiary_list_button();
        Utils.scrollToText("shalom",driver);
        transfersPage.clickContinueButton();
        Utils.waitForElement(driver,transfersPage.WizardStepTitle,10);
        transfersPage.clickContinueButton();
        transfersPage.amount.click();
        transfersPage.amount2.sendKeys("20");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        Utils.wait_and_click_Element(driver, transfersPage.yesPopUp, 10);
        Thread.sleep(1000);
        Utils.wait_and_click_Element(driver, transfersPage.yesPopUp, 10);
        Utils.waitForElement(driver, transfersPage.ConfirmationAmount, 10);
        transfersPage.clickAcceptButton();
        transfersPage.clickCaptureButton();

    }
    @Test(description = "ביצוע העברה בתוך בנק דיסקונט")
    @Ignore
    public void Transfer_ILS_Into_DiscountBank() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransfersPage transfersPage = new TransfersPage(driver);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Utils.wait_and_click_Element(driver, loginPage.AllowButton, 3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getTransfersPageTestId(),PropertyManager.getInstance().getTransfersPageTestPass(),PropertyManager.getInstance().getTransfersPageTestPass());
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.clicktransferButton();
        transfersPage.type_Name("kakushka");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        transfersPage.accountnum.sendKeys("153114543");
        transfersPage.typeNumAccount("11", "10");
        driver.navigate().back();
        Utils.waitForElement(driver, transfersPage.ContinueButton, 10);
        transfersPage.clickContinueButton();
        transfersPage.amount.click();
        transfersPage.amount2.sendKeys("20");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        Utils.wait_and_click_Element(driver, transfersPage.yesPopUp, 10);
        Thread.sleep(1000);
        Utils.wait_and_click_Element(driver, transfersPage.yesPopUp, 10);
        Utils.waitForElement(driver, transfersPage.ConfirmationAmount, 10);
        transfersPage.clickAcceptButton();
        transfersPage.clickCaptureButton();

    }
}