package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.time.Duration.ofSeconds;

public class ForeignCurrencyConversionsPage {
    public ForeignCurrencyConversionsPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(12)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public MobileElement continueButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך לשלב הבא'")
    public MobileElement board_continueButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור וביצוע ההמרה'")
    public MobileElement Accept_continueButton;


    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    public MobileElement cancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton")
    public MobileElement noticeButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/amountConverterEditTextLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n")
    public MobileElement amountConverterButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/amountConverterEditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n")
    public MobileElement amountEditText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/error_positive_button")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור'")
    public MobileElement OKButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/bottomConfirmButton")
    public MobileElement bottomConfirmButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/accountMainLayout")
    public MobileElement XXX;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public MobileElement ScreenCaptureButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ILS\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeCell' AND name BEGINSWITH 'שקל'")
    public MobileElement ILSButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"USD\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeCell' AND name CONTAINS 'דולר ארה'")
    public MobileElement USDButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"EUR\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeCell' AND name BEGINSWITH 'אירו'")
    public MobileElement EURButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'איזה חשבון לזכות?'")
    public MobileElement head_what_account;


    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name CONTAINS 'חשבון,'")
    public MobileElement click_one_account;

@Step("בחירת מטבע שקל")
public ForeignCurrencyConversionsPage click_ILSButton() {
    ILSButton.click();
    return this;
}
@Step("בחירת מטבע דולר")
public ForeignCurrencyConversionsPage click_USDButton() {
    USDButton.click();
    return this;
}


    @Step("לחיצה על המשך 1/5")
    public ForeignCurrencyConversionsPage click_continueButton() {
        this.continueButton.click();
        return this;
    }

    @Step("לחיצה על המשך 2/5")
    public ForeignCurrencyConversionsPage click_continueButton2() {
        this.continueButton.click();
        return this;
    }

    @Step("הזנת סכום 3/5")
    public ForeignCurrencyConversionsPage type_amountConverterButton(String amoun) {
//        this.amountConverterButton.click();
        this.amountEditText.sendKeys(amoun);
        return this;
    }

    @Step("לחיצה על המשך 3/5")
    public ForeignCurrencyConversionsPage click_continueButton3() {
        this.continueButton.click();
        return this;
    }
    @Step("לחיצה על אישור יום עסקים 3/5")
    public ForeignCurrencyConversionsPage click_OKButton() {
        this.OKButton.click();
        return this;
    }
    @Step("לחיצה אישור ביצוע ההמרה")
    public ForeignCurrencyConversionsPage click_continueButton4() {
        this.continueButton.click();
        return this;
    }
}