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

public class SwipeLoginPageTest extends BasePage{
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
    @Test(description = "יציאה מהחשבון")
    public void Log_out() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        dashbordPage.HamburgerButton.click();
        Utils.scrollToText("יציאה",driver);
        Thread.sleep(3000);


    }
//    @AfterMethod
//    public void teardown(){
//        driver.closeApp();
//    }
}

