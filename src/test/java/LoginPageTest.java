import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import Pages.*;
import Pages.BasePage;
import Pages.DashbordPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
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

    @Test(priority = 0, description = "לוגאין  מלא")
    public void Login()  {
        LoginPage loginPage=new LoginPage(driver);
            loginPage.EnterButton.click();
            loginPage.loginsuccesOnlyPass("1q1q1q");


    }

}