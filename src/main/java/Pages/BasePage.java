package Pages;

import Scrolling.MobileActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriverWait wait;
    public MobileActions mobileActions;
    public Properties prop;
    public AppiumDriver driver;


    public static ThreadLocal<AppiumDriver> tdriver =  new ThreadLocal<AppiumDriver>();

    @Parameters({"device", "appiumServer","systemPort","platformVersion","buildapp"})
    @BeforeMethod(alwaysRun = true)

    public AppiumDriver initialize_driver(String device, String appiumServer, String systemPort,String platformVersion,String buildapp)  {
        try {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,"true");
            cap.setCapability(MobileCapabilityType.NO_RESET, "false");
            cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            cap.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,"true");
            cap.setCapability(IOSMobileCapabilityType.LOCATION_SERVICES_AUTHORIZED, "true");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
            cap.setCapability(MobileCapabilityType.UDID, device);
            cap.setCapability("xcodeOrgId", "com.discountios1.WebDriverAgentRunner");
            cap.setCapability("xcodeSigningId", "iPhone Developer");
            cap.setCapability(IOSMobileCapabilityType.BUNDLE_ID, buildapp);
            cap.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, "true");
            cap.setCapability(IOSMobileCapabilityType.WDA_LOCAL_PORT, systemPort);
            URL url = new URL(appiumServer);
//            driver=new AppiumDriver<MobileElement>(url,cap);
            driver =new IOSDriver<MobileElement>(url,cap);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            Assert.assertNotNull(driver);



        } catch (Exception exp) {
            System.out.println("Cause is  " + exp.getCause());
            System.out.println("Massage is  " + exp.getMessage());
            exp.printStackTrace();
        }
        tdriver.set(driver);
        return  getDriver();
    }


    public static synchronized AppiumDriver getDriver() {
        return tdriver.get();
    }

    public void check_lock_devices(){
        if (((IOSDriver) driver).isDeviceLocked())
            ((IOSDriver) driver).unlockDevice();

    }


    public String getScreenshot() {
        File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
        File destination = new File(path);
        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            System.out.println("Capture Failed " + e.getMessage());
        }
        return path;
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod(): quit driver");
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
