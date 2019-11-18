import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;
import java.util.Properties;

import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import Listeners.TestAllureListener;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;
import Utils.PropertyManager;
@Listeners({TestAllureListener.class})


public class ChangeAccountTest extends BasePage {

    @Test(priority = 1, description = "החלפת חשבון")
    public void Change_Account() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        ChangeAccountPage changeAccountPage = new ChangeAccountPage(driver);
//        Utils.wait_and_click_Element(driver,loginPage.AllowButton,2);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getChangeAccountTestId(), PropertyManager.getInstance().getChangeAccountTestPass(), PropertyManager.getInstance().getChangeAccountTestPass());
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageMainButtonX")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        String Numnow = dashbordPage.accountNumber.getText();
        dashbordPage.clickchooseAcoountButton();
        changeAccountPage.clicknewAccount();
        Thread.sleep(4000);
        driver.navigate().back();
        dashbordPage.negative_button.click();
        //  Utils.waitForElement(driver,dashbordPage.balanceOfAccount,10);
        dashbordPage.HamburgerButton.click();
        String Numnow2 = dashbordPage.accountNumber.getText();

        if (Numnow != Numnow2) {
            System.out.println("חשבון הוחלף הבצלחה");
        } else System.out.println("חשבון לא הוחלף");
    }
}
//
//    @AfterMethod
//    public void teardown () {
//        driver.closeApp();
//    }
//}