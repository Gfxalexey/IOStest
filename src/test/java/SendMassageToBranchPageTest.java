import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import Pages.BasePage;
import Pages.DashbordPage;
import Pages.LoginPage;
import Pages.OpenDepositPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import Listeners.TestAllureListener;

@Listeners({TestAllureListener.class})

public class SendMassageToBranchPageTest extends BasePage{
//    AppiumDriver<MobileElement> driver;
//    public Properties prop;
//    public BasePage basePage;
//
//
//    @BeforeMethod
//    public void setup() throws MalformedURLException {
//        BasePage basePage = new BasePage();
////        driver=basePage.initialize_driver();
//        prop = basePage.initialize_Properties();
//
//    }
    @Test(description = "יצירת קשר מתוך החשבון")
    public void Send_massage_to_branche_after_login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        SendMassageToBranchPage send =new SendMassageToBranchPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("4806006","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("אפשרויות נוספות",driver);
        Utils.scrollToText("שליחת פנייה לסניף",driver);
        System.out.println(send.centerText.getText());
        send.clicksendrequestbutton();
        send.sugpniya.click();
        send.ChooseUreason("אחר",driver);
        send.typeText("bdika");
        driver.navigate().back();
        send.clickcontinueButton();
        System.out.println(send.finishText.getText());

    }
    @Test(priority = 0,description = "יצירת קשר מחוץ לחשבון")
    public void Send_massage_to_branche_befor_login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        SendMassageToBranchPage send =new SendMassageToBranchPage(driver);
        SearchBankPage searchBankPage=new SearchBankPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("4806006","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("יציאה",driver);
        Utils.waitForElement(driver,loginPage.snapshot,10);
        Utils.swipe(driver,Direction.RIGHT,2);
        searchBankPage.allowbutton.click();
        Utils.swipe(driver,Direction.RIGHT,2);
        send.clicksendrequestbutton();
        send.sugpniya.click();
        send.ChooseUreason("אחר",driver);
        send.typeAllParamMassage("alex","mih","4806006","052","7777777","asdsa@gmail.com","bdika");
        driver.navigate().back();
        send.clickcontinueButton();
        Utils.waitForElement(driver,send.finishText,10);
        System.out.println(send.finishText.getText());
    }
//    @AfterMethod
//    public void teardown(){
//        driver.closeApp();
//    }
}
