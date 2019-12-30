package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class MeetBankerPage {

    public MeetBankerPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/bankerMeeting_title")
    public MobileElement bankerMeeting_title;
    @AndroidFindBy(id = "com.ideomobile.discount:id/service_title")
    public MobileElement service_title;
    @AndroidFindBy(id = "com.ideomobile.discount:id/service_subTitle")
    public MobileElement service_subTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/bankerMeeting_infoButton")
    public MobileElement bankerMeeting_infoButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/bankerMeeting_continueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public MobileElement continueButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/BranchName")
    public MobileElement BranchName;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement permission_allow_button;

    @AndroidFindBy(id = "com.ideomobile.discount:id/findBranchesBranchNavigateButton")
    public MobileElement Branch_Navigate_Button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public MobileElement Branch_continueButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/banker_meeting_edit_text_popup_edit_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeTextView' AND name BEGINSWITH 'הזינו הערות כאן'")
    public MobileElement edit_text;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //מה מס' הנייד שלך?
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'מה מס׳ הנייד שלך?'")
    public MobileElement phone_titel;

    @AndroidFindBy(id = "com.ideomobile.discount:id/appointmentConfirmationCard") //
    public MobileElement appointmentConfirmationCard;

    @AndroidFindBy(id = "com.ideomobile.discount:id/bankerMeeting_appDetailsItem_cancelButton") //ביטול פגישה עם בנקאי
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'ביטול'")
    public MobileElement cancel_meet_banker_Button;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WhiteButtonsPopupPositiveButton") // (חלון קופץ) אישור ביטול
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'כן'")
    public MobileElement PopupPositiveButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WhiteButtonsPopupNegativeButton") //ביטול של הביטול (חלון קופץ)
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'בעצם לא'")
    public MobileElement PopupNegativeButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button") //ביטול של הביטול (חלון קופץ)
    public MobileElement permission_allow_button2;


    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'בירור צורכי אשראי'")
    public MobileElement credit_inquiry;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeCell' AND name CONTAINS 'ביום'")
    public MobileElement day;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור וקביעת פגישה'")
    public MobileElement AcceptFinish;
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'סגור'")
    public MobileElement closeKeyboard;
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'קבענו לך פגישה'")
    public MobileElement pgisha;



    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"תור לשירותי קופה\")")
    public MobileElement Line_Cash_Register;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"הפקדת מזומן \")")
    public MobileElement Cash_Deposit;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"פגישה עם בנקאי\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'פגישה עם בנקאי'")
    public MobileElement Meet_Banker;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"פגישת ייעוץ השקעות\")")
    public MobileElement Meet_with_Investment;

    @Step("לחיצה על אישור בחלון קופץ")
    public MeetBankerPage click_PopupPositiveButton() {
        PopupPositiveButton.click();
        return this;
    }

    @Step("לחיצה על ביטול פגישה")
    public MeetBankerPage click_cancel_meet_banker_Button() {
        cancel_meet_banker_Button.click();
        return this;
    }

    @Step("לחיצה על פגישת ייעוץ השקעות")
    public MeetBankerPage click_Meet_Banker() {
        Meet_Banker.click();
        return this;
    }

    @Step("לחיצה על המשך")
    public MeetBankerPage click_continueButton() {
        continueButton.click();
        return this;
    }
    @Step("לחיצה על המשך")
    public MeetBankerPage click_continueButton2() {
        Branch_continueButton.click();
        return this;
    }
    @Step("לחיצה על המשך")
    public MeetBankerPage click_continueButton3() {
        Branch_continueButton.click();
        return this;
    }
    @Step("לחיצה על אישור וקביעת פגישה")
    public MeetBankerPage click_finish_continue() {
        Branch_continueButton.click();
        return this;
    }
    @Step("הזנת טקסט")
    public MeetBankerPage type_text(String text) {
        edit_text.sendKeys(text);
        closeKeyboard.click();
        return this;
    }
}
