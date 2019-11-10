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

//    AppiumDriver<MobileElement> driver;
//    public Properties prop;
//    public BasePage basePage;
//
//
//    @BeforeMethod
//
//    public void setup() throws MalformedURLException {
//        BasePage basePage = new BasePage();
////        driver=basePage.initialize_driver();
//        prop = basePage.initialize_Properties();
//
//    }
    @Test(description = "דף הפרופיל שלי")
    public void MyProfileDashbord() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        MyProfilePage myProfilePage=new MyProfilePage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);

        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("4806006", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.click_MyProfile_button();
        Assert.assertEquals("הסניף שלי",myProfilePage.My_Branch.getText());



    }
//    @AfterMethod
//    public void teardown () {
//        driver.closeApp();
//    }
}
