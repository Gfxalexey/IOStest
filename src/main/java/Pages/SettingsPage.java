package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"מבט זריז\")")
    public MobileElement mabatZariz;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My Account\")")
    public MobileElement My_Account;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"דִידִי\")")
    public MobileElement didi;
    @AndroidFindBy(id = "com.ideomobile.discount:id/ServiceTermsAccepted")
    public MobileElement ServiceTermsAccepted_mabat_zariz;
    @AndroidFindBy(id = "com.ideomobile.discount:id/ServiceConfirmButton")
    public MobileElement ServiceConfirmButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/backToMainSetting")
    public MobileElement backToMainSetting;
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
