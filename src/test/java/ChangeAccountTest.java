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
    public void Change_Account_IOS() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        loginPage.EnterButton.click();
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getChangeAccountTestId(), PropertyManager.getInstance().getChangeAccountTestPass(), PropertyManager.getInstance().getChangeAccountTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,2);
        String Numnow = dashbordPage.num_3.getText();
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickchooseAcoountButton();
        Utils.TapCordinate(driver,214,194);
        String Numnow2 = dashbordPage.num_3.getText();
        if (Numnow != Numnow2) {
            System.out.println("חשבון הוחלף הבצלחה");
        } else System.out.println("חשבון לא הוחלף");
    }
}
