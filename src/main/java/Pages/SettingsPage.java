package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class SettingsPage {
    public SettingsPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"דיסקונט Touch\")")
    public MobileElement Touch;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My Finance\")")
    public MobileElement My_Finance;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'מבט זריז'")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"מבט זריז\")")
    public MobileElement mabatZariz;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My Account\")")
    public MobileElement My_Account;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"דִידִי\")")
    public MobileElement didi;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'קראתי והנני מאשר/ת את) תנאי שירות'")
    @AndroidFindBy(id = "com.ideomobile.discount:id/ServiceTermsAccepted")
    public MobileElement ServiceTermsAccepted_mabat_zariz;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הצטרפות'")
    @AndroidFindBy(id = "com.ideomobile.discount:id/ServiceConfirmButton")
    public MobileElement ServiceConfirmButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'חזרה'")
    @AndroidFindBy(id = "com.ideomobile.discount:id/backToMainSetting")
    public MobileElement backToMainSetting;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'סגירה'")
    @AndroidFindBy(id = "com.ideomobile.discount:id/exitFromMainSetting")
    public MobileElement exitFromMainSetting;

   @Step("לחיצה על עצבע")
    public SettingsPage click_Touch(){
       this.Touch.click();
       return this;
   }
    @Step("לחיצה על My Finance")
    public SettingsPage click_My_Finance(){
        this.My_Finance.click();
        return this;
    }
    @Step("לחיצה על מבט זריז")
    public SettingsPage click_mabatZariz(){
        this.mabatZariz.click();
        return this;
    }
    @Step("לחיצה על My_Account")
    public SettingsPage click_My_Account(){
        this.My_Account.click();
        return this;
    }
    @Step("לחיצה על דידי")
    public SettingsPage click_didi(){
        this.didi.click();
        return this;
    }
}
