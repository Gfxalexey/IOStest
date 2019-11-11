package Listeners;

import Scrolling.MobileActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
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

public class BasePage1 {
    protected WebDriverWait wait;
    protected MobileActions mobileActions;
    public AppiumDriver driver;
    public Properties prop;


    public static ThreadLocal<AppiumDriver> tdriver = new ThreadLocal<AppiumDriver>();
    @Parameters({"device", "appiumServer","systemPort"})
    @BeforeMethod(alwaysRun = true)

    public AppiumDriver initialize_driver(String device, String appiumServer, String systemPort) throws MalformedURLException {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformVersion", "9");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Oneplus6");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("udid", "192.168.1.152:5555");//b06bea8d   2c1dce28b03f7ece  192.168.1.152:5555

            capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT,systemPort);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
            capabilities.setCapability(MobileCapabilityType.UDID, device);





            capabilities.setCapability("appPackage", "com.ideomobile.discount");
            capabilities.setCapability("appActivity", "com.discount.ui.DiscountSplashActivity");
            URL url = new URL(appiumServer);
            driver = new AppiumDriver<MobileElement>(url, capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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