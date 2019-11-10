import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Properties;
import Listeners.TestAllureListener;
import Utils.PropertyManager;

@Listeners({TestAllureListener.class})

public class CreditCardPageTest extends  BasePage{


    @Test(description = "צפייה בדשבורד של כרטיסי אשראי")
    public void CreditCard_Dashbord() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CreditCardPage creditCardPage=new CreditCardPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getCreditCardPageTestId(), PropertyManager.getInstance().getCreditCardPageTestPass(), PropertyManager.getInstance().getCreditCardPageTestPass());
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/BotWalkMeClose")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.click_creditCardButton();
        Assert.assertEquals("כרטיסי אשראי",creditCardPage.titel.getText());
        Assert.assertEquals("סה\"כ לחיוב הקרוב",creditCardPage.summary_fragment_title.getText());
        Assert.assertEquals("סך יתרה לניצול",creditCardPage.credit_framework_title.getText());

    }
}