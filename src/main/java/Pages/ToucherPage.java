package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class ToucherPage {

    public ToucherPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/digitalJoinTitle") //ברוכים הבאים לטאצ'ר
    public MobileElement digitalJoinTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/digital_join_activity_continue_button") //להצטרפות לטאצ'ר
    public MobileElement join_continue_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    public MobileElement CancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //החשבונות שיצורפו לטאצ'ר
    public MobileElement StepTitle_1;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton") //המשך
    public MobileElement ContinueButton_1;
    @AndroidFindBy(id = "com.ideomobile.discount:id/digitalEmailEditText") //הזנת דואר אלקטרוני
    public MobileElement EmailEditText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton") //אישור בקשת הצטרפות
    public MobileElement ContinueButton_2;
    @AndroidFindBy(id = "com.ideomobile.discount:id/digitalContactBottomText") //מספר הטלפון ישמש את הבנק ליצירת קשר עמך במידת הצורך
    public MobileElement digitalContactBottomText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton") // i
    public MobileElement NoticeButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")
    public MobileElement StepTitle_Finish;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    public MobileElement ScreenCaptureButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/amortizationSchedule") //בקשתך בטיפול ונעדכן בהקדם
    public MobileElement amortizationSchedule;

    @Step("הזנת דואר אלקטרוני")
    public ToucherPage type_Email(String Email){
        this.EmailEditText.click();
        this.EmailEditText.sendKeys(Email);
        return  this;
    }
    @Step("לחיצה על הצטרפות לטאצ'ר")
    public ToucherPage click_join(){
        this.join_continue_button.click();
        return  this;
    }
    @Step("לחיצה על המשך")
    public ToucherPage click_ContinueButton_1(){
        this.ContinueButton_1.click();
        return  this;
    }
    @Step("לחיצה על אישור בקשת הצטרפות")
    public ToucherPage click_ContinueButton_2(){
        this.ContinueButton_2.click();
        return  this;
    }
    @Step("ביצוע צילום מסך")
    public ToucherPage click_ScreenCaptureButton(){
        this.ScreenCaptureButton.click();
        return  this;
    }


}
