import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import Pages.*;
import Pages.BasePage;
import Pages.DashbordPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import Listeners.TestAllureListener;
import Utils.PropertyManager;

@Listeners({TestAllureListener.class})

public class LoginPageTest extends BasePage {
@Test(priority = 0,description = "לוגאין  מלא")
    public void Login() throws InterruptedException {
    LoginPage loginPage = new LoginPage(driver);
    DashbordPage dashbordPage = new DashbordPage(driver);
    Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
    loginPage.EnterButton.click();
    Thread.sleep(1000);
    loginPage.loginsucces(PropertyManager.getInstance().getLoginPageTestId(),PropertyManager.getInstance().getLoginPageTestPass(),PropertyManager.getInstance().getLoginPageTestPass());
    dashbordPage.TutorialSkip.click();
    if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
        driver.navigate().back();
    }
    if(dashbordPage.HamburgerButton.isDisplayed()){
        System.out.println("לוגאין תקין");
    }else System.out.println("לוגאין נכשל");
}

    @Test(priority = 1,description = "לוגאין באמצעות סיסמא בלבד")
    public void LogWithOnlyPass() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getLoginPageTestId(),PropertyManager.getInstance().getLoginPageTestPass(),PropertyManager.getInstance().getLoginPageTestPass());
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        Utils.scrollToText("יציאה",driver);
        Utils.waitForElement(driver,loginPage.snapshot,10);
        loginPage.EnterButton.click();
        Thread.sleep(3000);
        loginPage.loginsuccesOnlyPass("1q1q1q");
        if (driver.findElements(By.id("com.ideomobile.discount:id/BotWalkMeClose")).size()>0){
        loginPage.Close_didiTutorial.click();
}
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        if(dashbordPage.HamburgerButton.isDisplayed()){
            System.out.println("לוגאין תקין");
        }else System.out.println("לוגאין נכשל");
    }
}
