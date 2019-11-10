package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CancelCashPage {
    public CancelCashPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);

    }
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ביטול הזמנה\")")
    public WebElement CancelButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"עדכון הזמנה\")")
    public WebElement UpdateButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ביטול\")")
    public WebElement CancelButton2;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"אישור\")")
    public WebElement AcceptButton;


    @Step("לחיצה על ביטול")
    public CancelCashPage click_CancelButton() {
        CancelButton.click();
        return this;
    }


    @Step("לחיצה על אישור")
    public CancelCashPage click_CancelButton2() {
        CancelButton2.click();
        return this;
    }
    @Step("לחיצה על אישור")
    public CancelCashPage click_AcceptButton() {
        AcceptButton.click();
        return this;
    }
    @Step("לחיצה על עדכון")
    public CancelCashPage click_UpdateButton() {
        UpdateButton.click();
        return this;
    }
}