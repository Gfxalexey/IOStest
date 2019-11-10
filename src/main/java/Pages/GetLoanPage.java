package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class GetLoanPage {
    public GetLoanPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/loansSelectionLobbyTitle") //כותרת של הלוואה
    public MobileElement loanTitel;
    @AndroidFindBy(id = "com.ideomobile.discount:id/get_loan_terms") //תנאי הלוואה
    public MobileElement loanTerms;
    @AndroidFindBy(id = "com.ideomobile.discount:id/regular_loan_continue_btn")
    public MobileElement loanContinueButton1;
    @AndroidFindBy(id = "com.ideomobile.discount:id/loansSelectionsLobbyCancelBtn")
    public MobileElement loanCancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public MobileElement loanContinueButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/LoansAmountDisplayedTextView")
    public MobileElement loantextamount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FragmentLoansAmountEditTextLayout")
    public MobileElement loanEditAmount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/LoansAmountNextStepLayout")//המשך לשבל הבא במקלדת
    public MobileElement loanNextBoard;
    @AndroidFindBy(id = "com.ideomobile.discount:id/LoansAmountDelete")
    public MobileElement loanDeletAmount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/LoansError")//סכום ההלוואה המינימלי הינו 1,000.00 ש"ח
    public MobileElement loanErrorAmountText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/textView") //סכום ההחזר החודשי
    public MobileElement loanEditmonth;
    @AndroidFindBy(id = "com.ideomobile.discount:id/payDayNote")// תשלום ההחזר הראשון עשוי להיות שונה בהתאם לתאריך
    public MobileElement loantext;
    @AndroidFindBy(id = "com.ideomobile.discount:id/LoansAmortizationPdf")//חוזה הלוואה
    public MobileElement loancontractlink;
    @AndroidFindBy(id = "com.ideomobile.discount:id/LoansAmortizationScheduleWithPDF")//לוח סילוקין
    public MobileElement loansilukinlink;
    @AndroidFindBy(id = "com.ideomobile.discount:id/amortization_schedule_header_exit")
    public MobileElement loanXbuttonsilukin;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")
    public MobileElement loanFinishText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")//צילום מסך
    public MobileElement loanScreenCaptureButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/loans_client_confirmation_amount")//סכום סיכום
    public MobileElement confirmation_amount;




    @Step("הזנת סכום של ההלוואה")
   public  GetLoanPage type_Amount(String num){
        this.loantextamount.click();
        this.loanDeletAmount.click();
        this.loanEditAmount.sendKeys(num);
        return this;
    }
}
