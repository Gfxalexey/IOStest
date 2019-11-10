import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
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
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Utils.wait_and_click_Element(driver, loginPage.AllowButton, 3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getTransfersPageTestId(),PropertyManager.getInstance().getTransfersPageTestPass(),PropertyManager.getInstance().getTransfersPageTestPass());
//        loginPage.loginsucces("320555683", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.clicktransferButton();
        transfersPage.typeName("shalom");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        transfersPage.accountnum.sendKeys("532142");
        transfersPage.typeNumAccount("31", "109");
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

    @Test(description = "ביצוע העברה מעל 6000")
    public void Transfer_ILS_With_OTP() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransfersPage transfersPage = new TransfersPage(driver);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Utils.wait_and_click_Element(driver, loginPage.AllowButton, 3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getTransfersPageTestId(),PropertyManager.getInstance().getTransfersPageTestPass(),PropertyManager.getInstance().getTransfersPageTestPass());

//        loginPage.loginsucces("320555683", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        dashbordPage.clicktransferButton();
        transfersPage.typeName("shalom");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        transfersPage.accountnum.sendKeys("532142");
        transfersPage.typeNumAccount("31", "109");
        driver.navigate().back();
        Utils.waitForElement(driver, transfersPage.ContinueButton, 10);
        transfersPage.clickContinueButton();
        transfersPage.amount.click();
        transfersPage.amount2.sendKeys("6001");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        Utils.wait_and_click_Element(driver, transfersPage.yesPopUp, 10);
        Thread.sleep(1000);
        Utils.wait_and_click_Element(driver, transfersPage.yesPopUp, 10);

        Utils.waitForElement(driver, transfersPage.otp_continue_button, 10);
        Assert.assertEquals("לקבלת קוד האימות בSMS", transfersPage.otp_continue_button.getText());
    }

    @Test(description = "ביצוע העברה מרשימת מוטבים")
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
        transfersPage.typeName("kakushka");
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