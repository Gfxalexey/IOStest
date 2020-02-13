package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CashWithdrawalPage {
    public CashWithdrawalPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(12)), this);

    }
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement AllowButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public  MobileElement ScreenCaptureButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardTitle\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeOther' AND name BEGINSWITH 'משיכת מזומן ללא כרטיס'")
    public MobileElement TitelText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'ביטול'")
    public MobileElement CancelButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public MobileElement ContinueButton;

     @AndroidFindBy(id = "com.ideomobile.discount:id/WizardBackButton")
     @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'חזרה'")
    public MobileElement BackButton;

     @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
     @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור'")
    public MobileElement ApprovalButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/withdraw_without_card_client_confirmation_bottom_info")
    public MobileElement FInishText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")
    public MobileElement EndText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/withdraw_without_card_bank_confirmation_phone")
    public MobileElement PhoneText;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH '450'")
    public MobileElement element450;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[3]")
    public MobileElement amount_carusel3;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]")
    public MobileElement amount_carusel1;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[2]")
    public MobileElement amount_carusel2;


    @Step("לחיצה על אישור")
    public CashWithdrawalPage click_ApprovalButton() {
        ApprovalButton.click();
        return this;
    }
    @Step("לחיצה על המשך")
    public CashWithdrawalPage click_ContinueButton() {
        ContinueButton.click();
        return this;
    }
    @Step("לחיצה על ביטול")
    public CashWithdrawalPage click_CancelButton() {
        CancelButton.click();
        return this;
    }
    @Step("לחיצה שלב אחרוה")
    public CashWithdrawalPage click_BackButton() {
        BackButton.click();
        return this;
    }
    @Step(" הדפסת טלפון")
    public CashWithdrawalPage get_PhoneText() {
        PhoneText.getText();
        return this;
    }

}



