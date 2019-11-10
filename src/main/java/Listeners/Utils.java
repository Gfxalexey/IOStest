package Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Utils {

    /*
     * Read a property from the config.properties file and return the value
     * If value not exist return a 'Value not set or empty' exception
     */
    public static String readProperty(String property) {
        Properties prop;
        String value = null;
        try {
            prop = new Properties();
            prop.load(new FileInputStream(new File("config.properties")));

            value = prop.getProperty(property);

            if (value == null || value.isEmpty()) {
                throw new Exception("Value not set or empty");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }
}