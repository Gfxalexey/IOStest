package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CancelCyclicTransferPage {


    public CancelCyclicTransferPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/standingOrderCancelItemMainLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton\n")
    public MobileElement standingOrderCancel;

    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'ביטול'")
    public MobileElement CancelButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הבהרות'")
    public MobileElement WizardLegalNoticeButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeOther' AND name BEGINSWITH 'ביטול הוראה'")
    public MobileElement WizardTitle;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור'")
    public MobileElement AcceptContinueButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //הבקשה בטרם ביצועה נא לעבור על פרטי

    public MobileElement WizardStepTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public MobileElement ContinueButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/standing_order_cancel_client_confirmation_gagola")   //פירוט עמלות לפעולה
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]\n")
    public MobileElement gagola;


    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")   //ההעברה המחזורית (הוראת קבע) בוטלה
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'ההעברה המחזורית (הוראת קבע) בוטלה'")
    public MobileElement StepTitle;

    @AndroidFindBy(id = "com.ideomobile.discount:id/cancelTransferFinishTopClarification")   //הביטול יכנס לתוקף מיידי ויחול על העברות שטרם בוצעו
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'הביטול יכנס לתוקף מיידי ויחול על העברות שטרם בוצעו'")
    public MobileElement cancelTransferFinishTopClarification;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")   //הביטול יכנס לתוקף מיידי ויחול על העברות שטרם בוצעו
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public MobileElement ScreenCaptureButton;


}
