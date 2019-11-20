package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CancelCyclicTransferPage {


    public CancelCyclicTransferPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/standingOrderCancelItemMainLayout")
    public MobileElement standingOrderCancel;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    public MobileElement CancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton")
    public MobileElement WizardLegalNoticeButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardTitle")
    public MobileElement WizardTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public MobileElement WizardContinueButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //הבקשה בטרם ביצועה נא לעבור על פרטי
    public MobileElement WizardStepTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public MobileElement ContinueButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/standing_order_cancel_client_confirmation_gagola")   //פירוט עמלות לפעולה
    public MobileElement gagola;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")   //ההעברה המחזורית (הוראת קבע) בוטלה
    public MobileElement StepTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/cancelTransferFinishTopClarification")   //הביטול יכנס לתוקף מיידי ויחול על העברות שטרם בוצעו
    public MobileElement cancelTransferFinishTopClarification;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")   //הביטול יכנס לתוקף מיידי ויחול על העברות שטרם בוצעו
    public MobileElement ScreenCaptureButton;


}
