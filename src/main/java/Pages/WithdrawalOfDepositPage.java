package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class WithdrawalOfDepositPage {
    public WithdrawalOfDepositPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"פיקדון פרימון עם תחנות יציאה שבועיות\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND value BEGINSWITH 'פיקדון פרימון עם תחנות יציאה שבועיות'")
    public MobileElement primon;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND value BEGINSWITH 'תחנת יציאה'")
    public MobileElement date_primon;


    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"משיכה בתחנה הקרובה\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND value BEGINSWITH[c]  'משיכה' AND visible ==1")
    public MobileElement meshihaNow;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"אי חידוש במועד הפירעון\")")
    public MobileElement noHidush;

    @AndroidFindBy(id = "com.ideomobile.discount:id/deposit_line_details_button")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'משיכה'")
    public MobileElement meshihaButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public MobileElement сontinueButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/DepositsWithdrawalAmountDisplayedTextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הזנת סכום חלקי'")
    public MobileElement amoun;

    @AndroidFindBy(id = "com.ideomobile.discount:id/DepositsWithdrawalAmountSetAmountEditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]\n")
    public MobileElement EditAmoun;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardBackButton")
    public MobileElement BackButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/DepositWithdrawalFullText")
    public MobileElement meshihaAllamoun;

    @AndroidFindBy(id = "com.ideomobile.discount:id/DepositsWithdrawalAmountNextStepLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך לשלב הבא'")
    public MobileElement boardNextstep;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור וביצוע המשיכה'")
    public MobileElement сontinueButton1;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public MobileElement ScreenCaptureButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/SummaryDataLayout")
    public MobileElement clickclick;
    @AndroidFindBy(id = "com.ideomobile.discount:id/depositsWithdrawalClientConfirmationAmount")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'סיכום פרטי המשיכה'")
    public MobileElement ConfirmationAmount;

    @Step("לחיצת על  משיכה של הפקדה")
    public WithdrawalOfDepositPage clickperyomButton() {
        primon.click();
        return this;
    }
    @Step("לחיצת על צילום מסך")
    public WithdrawalOfDepositPage clickScreenCaptureButton() {
        ScreenCaptureButton.click();
        return this;
    }
    @Step("לחיצת על  משיכה")
    public WithdrawalOfDepositPage clickmeshihaButton() {
        meshihaButton.click();
        return this;
    }
    @Step("לחיצת על  משיכה בתחנה הקרובה")
    public WithdrawalOfDepositPage clickmeshihaNow() {
        meshihaNow.click();
        return this;
    }
    @Step("לחיצה על אישור וביצוע הפעולה")
    public WithdrawalOfDepositPage clickсontinueButton1() {
        сontinueButton1.click();
        return this;
    }
    @Step("לחיצת על  אי חידוש")
    public WithdrawalOfDepositPage clicknoHidush() {
        noHidush.click();
        return this;
    }
@Step("לחיצת על המשך")
    public WithdrawalOfDepositPage clickсontinueButton() {
    сontinueButton.click();
        return this;
    }
@Step("לחיצת לשלב קודם")
    public WithdrawalOfDepositPage clickBackButton() {
    BackButton.click();
        return this;
    }
@Step("לחיצת על המשך במקלדת")
    public WithdrawalOfDepositPage clickboardNextstep() {
    boardNextstep.click();
        return this;
    }

    @Step("הזנת סכום")
    public  WithdrawalOfDepositPage type_Amoun(String amoun){
        this.amoun.click();
        this.EditAmoun.sendKeys(amoun);
        this.boardNextstep.click();
        return  this;
    }
}