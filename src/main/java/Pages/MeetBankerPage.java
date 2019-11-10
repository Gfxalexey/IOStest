package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    public MobileElement edit_text;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //מה מס' הנייד שלך?
    public MobileElement phone_titel;
    @AndroidFindBy(id = "com.ideomobile.discount:id/appointmentConfirmationCard") //
    public MobileElement appointmentConfirmationCard;



    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"תור לשירותי קופה\")")
    public MobileElement Line_Cash_Register;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"הפקדת מזומן \")")
    public MobileElement Cash_Deposit;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"פגישה עם בנקאי\")")
    public MobileElement Meet_Banker;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"פגישת ייעוץ השקעות\")")
    public MobileElement Meet_with_Investment;

    @Step("לחיצה על פגישת ייעוץ השקעות")
    public MeetBankerPage click_Meet_with_Investment() {
        Meet_with_Investment.click();
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
        return this;
    }
}
