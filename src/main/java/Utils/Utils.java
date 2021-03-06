package Utils;

import Pages.Direction;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Utils {
    private static boolean isElementPresent;
    public static AppiumDriver<MobileElement> driver;


    //    public static void scrollToTextIOS2019(String text, AppiumDriver<MobileElement> driver,MobileElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap scrollObject = new HashMap<>();
//        scrollObject.put("predicateString", "value == '" + text + "'");
//        scrollObject.put("direction", "down");
//        js.executeScript("mobile: scroll", scrollObject);
//
//        element.click();
//    }
    public static void scrollToTextIOS(String text, AppiumDriver<MobileElement> driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("predicateString", "value == '" + text + "'");
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);

    }

    public static void swipeIos(String where, AppiumDriver<MobileElement> driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", where);
        js.executeScript("mobile: scroll", scrollObject);
    }


    public static void scrollToText(String text, AppiumDriver<MobileElement> driver) throws InterruptedException {
        List<MobileElement> elements = driver.findElements(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().textContains(\"" + text + "\"));"));
        elements.get(0).click();
    }

    public static void scrollToText2(String text, AppiumDriver<MobileElement> driver) throws InterruptedException {
        WebElement getElementByText = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceIdMatches(\"*:id/people_form_recyclerview\")).getChildByText("
                        + "new UiSelector().resourceIdMatches(\"*:id/formElementValue\"), \"" + text + "\")"));
        getElementByText.click();

    }


    public static void scrollScreen(AppiumDriver<MobileElement> driver) {
        Dimension dim = driver.manage().window().getSize();
        Double screenHeightStart = dim.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dim.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) driver)
                .press(point(0, scrollStart))
                .waitAction(waitOptions(ofSeconds(2)))
                .moveTo(point(0, scrollEnd))
                .release().perform();


    }

    public static void scrollScreenAll(AppiumDriver<MobileElement> driver, int howManySwipes, WebElement element) {
        Dimension dim = driver.manage().window().getSize();
        Double screenHeightStart = dim.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dim.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();

        for (int i = 1; i <= howManySwipes; i++) {
            new TouchAction((PerformsTouchActions) driver)
                    .press(point(0, scrollStart))
                    .waitAction(waitOptions(ofSeconds(2)))
                    .moveTo(point(0, scrollEnd))
                    .release().perform();

            boolean isElementPresent = element.isDisplayed();
            if (isElementPresent) {
                element.click();
                break;
            } else System.out.println("element is not found");

        }


    }


    public static void swipeDown(int howManySwipes, AppiumDriver<MobileElement> driver, String text, int index) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.8);
        int endVerticalY = (int) (size.height * 0.21);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {
                new TouchAction<>(driver).press(point(startVerticalX, startVerticalY))
                        .waitAction(waitOptions(ofSeconds(4))).moveTo(point(startVerticalX, endVerticalY)).release()
                        .perform();
                Thread.sleep(2000);

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        Thread.sleep(3000);
        List<MobileElement> elements = driver.findElements(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().textContains(\"" + text + "\"));"));
        elements.get(index).click();

    }


    public static void swipe(MobileDriver driver, Direction direction, long duration) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();

        int startX = 0;
        int endX = 0;
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case RIGHT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                new TouchAction<>(driver)
                        .press(point(startX, startY))
                        .waitAction(waitOptions(ofSeconds(duration)))
                        .moveTo(point(endX, startY))
                        .release()
                        .perform();
                Thread.sleep(1000);

                break;

            case LEFT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.05);
                endX = (int) (size.width * 0.90);
                new TouchAction<>(driver)
                        .press(point(startX, startY))
                        .waitAction(waitOptions(ofSeconds(duration)))
                        .moveTo(point(endX, startY))
                        .release()
                        .perform();

                break;

            case UP:
                endY = (int) (size.height * 0.70);
                startY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                new TouchAction<>(driver)
                        .press(point(startX, startY))
                        .waitAction(waitOptions(ofSeconds(duration)))
                        .moveTo(point(endX, startY))
                        .release()
                        .perform();

                break;


            case DOWN:
                startY = (int) (size.height * 0.70);
                endY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                new TouchAction<>(driver)
                        .press(point(startX, startY))
                        .waitAction(waitOptions(ofSeconds(duration)))
                        .moveTo(point(endX, startY))
                        .release()
                        .perform();

                break;

        }

    }

    public static boolean waitForElement(AppiumDriver<MobileElement> driver, WebElement element, int seconds)  {

        try {
            Thread.sleep(1500);
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.visibilityOf(element));
            isElementPresent = element.isDisplayed();
            return isElementPresent;
        } catch (Exception e) {
            isElementPresent = false;
            System.out.println(e.getMessage());
            return isElementPresent;
        }

    }

    public static void waitForbanner(AppiumDriver<MobileElement> driver, WebElement element, int seconds) throws InterruptedException {

        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.visibilityOf(element));
            boolean isElementPresent = element.isDisplayed();
            if (isElementPresent) {
                driver.navigate().back();
            } else {
                System.out.println("element not found!!!!");
            }
        } catch (Exception e) {
            isElementPresent = false;
            System.out.println(e.getMessage());
        }
    }

    public static void wait_and_click_Element(AppiumDriver<MobileElement> driver, WebElement element, int seconds) {

        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.visibilityOf(element));
            boolean isElementPresent = element.isDisplayed();
            if (isElementPresent) {
                element.click();
            } else {
                System.out.println("element not found!!!!");
            }
        } catch (Exception e) {
            isElementPresent = false;
            System.out.println(e.getMessage());
        }
    }

    public static String Replace(String element) {
        String str = element;
        str = str.replaceAll(",", "");
        System.out.println(str);
        return str;
    }


    public static void DragElement(WebElement element, WebElement ToElement, AppiumDriver<MobileElement> driver, long duration) {
        AndroidTouchAction touch = new AndroidTouchAction(driver);
        touch.longPress(ElementOption.element(element)).waitAction(waitOptions(ofSeconds(duration)))
                .moveTo(ElementOption.element(ToElement)).release().perform();
    }

    public static void DragElementIOS(WebElement element, WebElement ToElement, AppiumDriver<MobileElement> driver, long duration) {
        IOSTouchAction touch = new IOSTouchAction(driver);
        touch.longPress(ElementOption.element(element)).waitAction(waitOptions(ofSeconds(duration)))
                .moveTo(ElementOption.element(ToElement)).release().perform();
    }

    public static void DragElement_point_to_point(int x_start, int y_start, int x_stop, int y_stop, long duration, AppiumDriver<MobileElement> driver) {
        new TouchAction(driver).longPress(point(x_start, y_start)).waitAction(waitOptions(ofSeconds(duration)))
                .moveTo(point(x_stop, y_stop)).release().perform();
    }


    public static void TapCordinate(AppiumDriver<MobileElement> driver, int x, int y) {
        Map<String, Object> args = new HashMap<>();
        args.put("x", x);
        args.put("y", y);
        driver.executeScript("mobile: tap", args);
    }


    public static void swipe_To_Element_IOS(WebElement element,int x_start, int y_start, int x_stop, int y_stop, long duration, AppiumDriver<MobileElement> driver) {

        boolean isElementPresent = element.isDisplayed();
       TouchAction touchAction=new TouchAction(driver);

       do {
        touchAction.longPress(point(x_start, y_start)) .waitAction(waitOptions(ofSeconds(duration)))
                    .moveTo(point(x_stop, y_stop)) .release() .perform();
        }while (isElementPresent=false);




    }


}











