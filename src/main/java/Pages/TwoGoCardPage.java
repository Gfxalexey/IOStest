package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class TwoGoCardPage {
    public TwoGoCardPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardTitle") //טעינת כרטיס 2go
    public MobileElement Title;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //סכום טעינה
    public MobileElement StepTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton") //
    public MobileElement NoticeButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/card2GoAmountDisplayedTextView") //הזנת סכום
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'הזנת סכום'")
    public MobileElement card2GoAmount;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value  BEGINSWITH 'המשך'")
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton") //
    public MobileElement ContinueButton_1;

    @AndroidFindBy(id = "com.ideomobile.discount:id/charge_2go_max_amount") // הסכום המרבי בכרטיס לא יעלה על 450 ש"ח
    public MobileElement charge_2go_max_amount;

    @AndroidFindBy(id = "com.ideomobile.discount:id/card2GoAmountSetAmountEditText") // שינוי סכום
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField'")
    public MobileElement SetAmoun;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value  BEGINSWITH 'המשך לשלב הבא'")
    public MobileElement Next_board;

    @AndroidFindBy(id = "com.ideomobile.discount:id/charge2goClientConfirmationAmount") //
    public MobileElement Confirmation_Amount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/charge2goClientConfirmationCharge") //עמלות
    public MobileElement ConfirmationCharge;


    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton") //אישור וביצוע הטעינה
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value  BEGINSWITH 'אישור וביצוע הטעינה'")
    public MobileElement ContinueButton_2;


    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton") //ביטול
    public MobileElement CancelButton;


    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton") //
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public MobileElement ScreenCaptureButton;

//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[2]/**/XCUIElementTypeStaticText[2]")
//    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'IDANףםךב םפ'")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton\n")
    public MobileElement card_2go;


    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //
    public MobileElement WizardStepTitle;


//--------------------------------------------------------------------------------------------------------------

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'סכום טעינה'")
    public MobileElement amount_text_head;
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name CONTAINS 'הסכום המרבי בכרטיס לא יעלה על 450 ש/״ח'")
    public MobileElement text_max_amount;





    @Step("הזנת סכום")
    public TwoGoCardPage type_Amount (String amount) {
        this.card2GoAmount.click();
        this.SetAmoun.sendKeys(amount);
        return  this;
    }

    @Step("הזנת סכום")
    public TwoGoCardPage click_Next_board () {
        this.Next_board.click();
        return  this;
    }

    @Step("לחיצה על בחירת כרטיס")
    public TwoGoCardPage click_card_2go () {
        this.card_2go.click();
        return  this;
    }
    @Step("לחיצה על המשך")
    public TwoGoCardPage click_ContinueButton () {
        this.ContinueButton_1.click();
        return  this;
    }
    @Step("לחיצה על אישור וביצוע הטעינה")
    public TwoGoCardPage click_ContinueButton_2 () {
        this.ContinueButton_2.click();
        return  this;
    }
    @Step("לחיצה על ביצוע צילום מסך")
    public TwoGoCardPage click_ScreenCaptureButton () {
        this.ScreenCaptureButton.click();
        return  this;
    }


}
