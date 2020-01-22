import Listeners.TestAllureListener;
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

@Listeners({TestAllureListener.class})

public class MyProfilePageTest extends BasePage{


    @Test(description = "דף הפרופיל שלי")
    public void MyProfileDashbord() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        MyProfilePage myProfilePage=new MyProfilePage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        loginPage.EnterButton.click();
        dashbordPage.HamburgerButton.click();
        dashbordPage.click_MyProfile_button();
        Assert.assertEquals("הסניף שלי",myProfilePage.My_Branch.getText());



    }
//    @AfterMethod
//    public void teardown () {
//        driver.closeApp();
//    }
}
