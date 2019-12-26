package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class OpenDepositPage {
    public OpenDepositPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]\n")
    public MobileElement TitelText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView\n")
    public MobileElement HeadText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.Button\n")
    public MobileElement CancelButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[4]/android.widget.TextView\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הזנת סכום'")
    public MobileElement clickAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\n")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")
    public MobileElement tAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך לשלב הבא'")
    public MobileElement NextButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"פר יום - ריבית קבועה לשלושה חודשים עם תחנות יומיות\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'פר יום - ריבית קבועה לשלושה חודשים עם תחנות יומיות  '")
    public MobileElement Deposit;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public MobileElement NextButton2;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"חזרה\"]\n")
    public MobileElement BackButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'קרן וריבית'")
    public MobileElement typeRate;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור וביצוע ההפקדה'")
    public MobileElement FinishButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView\n")
    public MobileElement FinishText;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout\n")
    public MobileElement FinishAllText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public  MobileElement ScreenCaptureButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/depoistsDepositClientConfirmationAmount")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'סיכום פרטי ההפקדה'")
    public  MobileElement ConfirmationAmount;

    @AndroidFindBy(id = "com.ideomobile.discount:id/bannerImageImageView")
    public  MobileElement banner;





    @Step("בחירת פקדון")
    public OpenDepositPage typeDeposit(){
        this.Deposit.click();
        return this;
    }
    @Step("לחיצה על אישור")
    public OpenDepositPage clickFinishButton(){
        this.FinishButton.click();
        return this;
    }
    @Step("לחיצה על שמירה כתמונה")
    public OpenDepositPage click_ScreenCaptureButton(){
        this.ScreenCaptureButton.click();
        return this;
    }
    @Step("הזנת סכום")
    public OpenDepositPage type_amount(String amount) {
    this.clickAmount.click();
    this.tAmount.sendKeys(amount);
    return  this;
    }


}

