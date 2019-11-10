package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    public  MobileElement ScreenCaptureButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardTitle\n")
    public MobileElement TitelText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton\n")
    public MobileElement CancelButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    public MobileElement ContinueButton;
     @AndroidFindBy(id = "com.ideomobile.discount:id/WizardBackButton")
    public MobileElement BackButton;
     @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public MobileElement ApprovalButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/withdraw_without_card_client_confirmation_bottom_info")
    public MobileElement FInishText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")
    public MobileElement EndText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/withdraw_without_card_bank_confirmation_phone")
    public MobileElement PhoneText;

    @Step("לחיצה על אישור")
    public CashWithdrawalPage clickApprovalButton() {
        ApprovalButton.click();
        return this;
    }
    @Step("לחיצה על המשך")
    public CashWithdrawalPage clickContinueButton() {
        ContinueButton.click();
        return this;
    }
    @Step("לחיצה על ביטול")
    public CashWithdrawalPage clickCancelButton() {
        CancelButton.click();
        return this;
    }
    @Step("לחיצה שלב אחרוה")
    public CashWithdrawalPage clickBackButton() {
        BackButton.click();
        return this;
    }
    @Step(" הדפסת טלפון")
    public CashWithdrawalPage getPhoneText() {
        PhoneText.getText();
        return this;
    }

}



