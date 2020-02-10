import Utils.Utils;
import Pages.BasePage;
        import Pages.DashbordPage;
        import Pages.LoginPage;
import org.testng.annotations.*;

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

