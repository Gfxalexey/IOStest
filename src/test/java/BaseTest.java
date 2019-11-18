import Scrolling.MobileActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public  class BaseTest {
    public AppiumDriver driver;
    protected WebDriverWait wait;
    public Properties prop;

    public static ThreadLocal<AppiumDriver> tdriver = new ThreadLocal<AppiumDriver>();
    @Parameters({"device", "appiumServer","systemPort"})
    @BeforeMethod(alwaysRun = true)

    public AppiumDriver setup(String device, String appiumServer, String systemPort) throws MalformedURLException {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(AutomationName.ANDROID_UIAUTOMATOR2,"uiautomator");//
            cap.setCapability("automationName", "UiAutomator2");
            cap.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT,systemPort);
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
            cap.setCapability(MobileCapabilityType.UDID, device);
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ideomobile.discount");
            cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.discount.ui.DiscountSplashActivity");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//            cap.setCapability(MobileCapabilityType.VERSION, 9);
            URL url = new URL(appiumServer);
            driver = new AppiumDriver<MobileElement>(url, cap);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Assert.assertNotNull(driver);
        } catch (Exception exp) {
            System.out.println("Cause is  " + exp.getCause());
            System.out.println("Massage is  " + exp.getMessage());
            exp.printStackTrace();
        }
        tdriver.set(driver);
        return getDriver();
    }
    public static synchronized AppiumDriver getDriver() {
        return tdriver.get();
    }
    public Properties initialize_Properties() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("D:/project/Import/discountpageopjectseleniumtest/src/main/java/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
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

