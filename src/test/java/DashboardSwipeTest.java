import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import Pages.*;
import Pages.BasePage;
import Pages.DashbordPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import Listeners.TestAllureListener;


@Listeners({TestAllureListener.class})
public class DashboardSwipeTest extends BasePage {
//    AppiumDriver<MobileElement> driver;
//    public Properties prop;
//    public BasePage basePage;
//
//
//
//    @BeforeMethod
//    public void setup() throws MalformedURLException {
//        BasePage basePage = new BasePage();
////        driver=basePage.initialize_driver();
//        prop = basePage.initialize_Properties();
//
//    }
    @Test(priority = 0,description = "מעבר ללובי עובר ושב")
    public void SwipeToOsh() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        Utils.swipe(driver,Direction.RIGHT,1);
//        Thread.sleep(2000);
    }
    @Test(priority = 1,description = "מעבר ללובי כרטיסי אשראי")
    public void SwipeToCreditCard() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        OpenDepositPage openDepositPage = new OpenDepositPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(2000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);

        Thread.sleep(2000);
    }
    @Test(priority = 2,description = "מעבר ללובי שוק ההון")
    public void SwipeToTrade() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage=new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);

    }
    @Test(priority = 3,description = "מעבר ללובי הלוואות")
    public void SwipeToLoans() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage=new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
    }
    @Test(priority = 4,description = "מעבר ללובי פיקדונות")
    public void SwipeToDeposit() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
    }
    @Test(priority = 5,description = "מעבר ללובי עוש מטח")
    public void SwipeToForeign() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
    }
    @Test(priority = 6,description = "מעבר ללובי משכנתאות")
    public void SwipeToMortage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
        Thread.sleep(1000);
        Utils.swipe(driver,Direction.RIGHT,1);
    }

}
