package Listeners;


import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Attachment;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Mylistener implements ITestListener {

        @Override
        public void onTestStart(ITestResult iTestResult) {

        }

        @Override
        public void onTestSuccess(ITestResult iTestResult) {

        }

        @Override
        public void onTestFailure(ITestResult iTestResult) {
            Class clazz = iTestResult.getTestClass().getRealClass();
            try {
                // this field name must be present and equals in any testcase
                Field field = clazz.getDeclaredField("driver");
                ((Field) field).setAccessible(true);

                AppiumDriver<?> driver = (AppiumDriver<?>) field.get(iTestResult.getInstance());

                File file = driver.getScreenshotAs(OutputType.FILE);

                // the filename is the folder name on test.screenshot.path property plus the completeTestName
                FileUtils.copyFile(file,
                        new File(Utils.readProperty("test.screenshot.path") + "/" + composeTestName(iTestResult) + ".png"));

            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onTestSkipped(ITestResult iTestResult) {

        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

        }

        @Override
        public void onStart(ITestContext iTestContext) {

        }

        @Override
        public void onFinish(ITestContext iTestContext) {

        }


        private String composeTestName(ITestResult iTestResult) {
            StringBuffer completeFileName = new StringBuffer();

            completeFileName.append(iTestResult.getTestClass().getRealClass().getSimpleName()); // simplified class name
            completeFileName.append("_");
            completeFileName.append(iTestResult.getName()); // method name

            // all the parameters information
            Object[] parameters = iTestResult.getParameters();
            for(Object parameter : parameters) {
                completeFileName.append("_");
                completeFileName.append(parameter);
            }

            // return the complete name and replace : by - (in the case the emulator have port as device name)
            return completeFileName.toString().replace(":", "-");
        }
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(AppiumDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    }

