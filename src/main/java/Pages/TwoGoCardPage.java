package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    public MobileElement card2GoAmount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton") //
    public MobileElement ContinueButton_1;
    @AndroidFindBy(id = "com.ideomobile.discount:id/charge_2go_max_amount") // הסכום המרבי בכרטיס לא יעלה על 450 ש"ח
    public MobileElement charge_2go_max_amount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/card2GoAmountSetAmountEditText") // שינוי סכום
    public MobileElement SetAmoun;
    @AndroidFindBy(id = "com.ideomobile.discount:id/charge2goClientConfirmationAmount") //
    public MobileElement Confirmation_Amount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/charge2goClientConfirmationCharge") //עמלות
    public MobileElement ConfirmationCharge;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton") //אישור וביצוע הטעינה
    public MobileElement ContinueButton_2;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton") //ביטול
    public MobileElement CancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton") //
    public MobileElement ScreenCaptureButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle") //
    public MobileElement WizardStepTitle;










    @Step("הזנת סכום")
    public TwoGoCardPage type_Amount (String amount) {
        this.card2GoAmount.click();
        this.SetAmoun.sendKeys(amount);
        return  this;
    }

    @Step("לחיצה על המשך")
    public TwoGoCardPage click_ContinueButton_1 () {
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
