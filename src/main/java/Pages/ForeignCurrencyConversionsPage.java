package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    public MobileElement continueButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    public MobileElement cancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton")
    public MobileElement noticeButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/amountConverterEditTextLayout")
    public MobileElement amountConverterButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/amountConverterEditText")
    public MobileElement amountEditText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/error_positive_button")
    public MobileElement OKButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/bottomConfirmButton")
    public MobileElement bottomConfirmButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/accountMainLayout")
    public MobileElement XXX;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    public MobileElement ScreenCaptureButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ILS\")")
    public MobileElement ILSButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"USD\")")
    public MobileElement USDButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"EUR\")")
    public MobileElement EURButton;

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
        this.amountConverterButton.click();
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