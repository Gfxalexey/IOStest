package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class TransfersPage {
    public TransfersPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardTitle\n")
    @iOSXCUITFindBy(accessibility = "כניסה לחשבונך")
    public WebElement TitelText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton\n")
    @iOSXCUITFindBy(accessibility = "ביטול")
    public WebElement CancelButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle\n")//למי להעביר?
    @iOSXCUITFindBy(accessibility = "למי להעביר?")
    public WebElement Titel2Text;

    @AndroidFindBy(id = "com.ideomobile.discount:id/choose_beneficiary_from_beneficiary_list_button")//או בחרו מרשימה/ מהעברה קודמת
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'או בחרו מרשימה / מהעברה קודמת'")
    public WebElement beneficiary_list_button;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public WebElement ContinueButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public WebElement ContinueButton2;

    @AndroidFindBy(id = "com.ideomobile.discount:id/transfers_beneficiary_name_text\n")
    @iOSXCUITFindBy(accessibility = "שם מלא לחץ לעריכה\n")
    public WebElement BeneficiaryNameText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/choose_beneficiary_next_step_button\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'המשך לשלב הבא'")
    public WebElement BoardNextButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שם מלא  לחץ לעריכה'")
    public WebElement Name;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'או בחרו מרשימה / מהעברה קודמת'")
    public WebElement Name2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Return\"]\n")
    public WebElement Keyboard_Return;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המשך'")
    public WebElement Keyboard_next;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView\n")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]\n")
//    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'הבנק והסניף בו מנוהל החשבון'")
    public WebElement BranchANDbank;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeTextField' AND value BEGINSWITH 'שם בנק/ מספר בנק'")
    public WebElement banksade;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout\n")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]/**/XCUIElementTypeStaticText[2]")
    public WebElement bankNum;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeTextField' AND value BEGINSWITH 'שם/ מספר סניף'")
    public WebElement branch;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell\n")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]/**/XCUIElementTypeStaticText[2]")
    public WebElement branchsade;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout\n")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")

    public WebElement mauthavara;
    @AndroidFindBy(id = "com.ideomobile.discount:id/TransfersBankAccountNumber\n")
    public WebElement mauthavara2;
    @AndroidFindBy(id = "com.ideomobile.discount:id/TransfersBankAccountNumber")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeTextField' AND value BEGINSWITH 'מספר החשבון של המוטב'")
    public WebElement accountnum;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    public WebElement nextbutton2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'סכום'")
    public WebElement amount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור וביצוע ההעברה'")
    public WebElement AcceptButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView\n")
    public WebElement finishText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeTextField'")
    public WebElement amount2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]\n")
    public WebElement contAmoun;

    @AndroidFindBy(id = "com.ideomobile.discount:id/error_positive_button")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'אישור'")
    public WebElement yesPopUp;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND value BEGINSWITH 'רק מוודאים ששמת לב... כבר ביצעת העברה למוטב זה ביום הערך הנוכחי. רוצה להמשיך?'")
    public WebElement popUp_Text_double_trans;


    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public WebElement CaptureButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/transfers_client_confirmation_amount")
    public  MobileElement ConfirmationAmount;

    @AndroidFindBy(id = "com.ideomobile.discount:id/ofp_continue_button")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'לקבלת קוד אימות בSMS'")
    public  MobileElement otp_continue_button;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND value BEGINSWITH 'פעולה זו דורשת אימות נוסף'")
    public  MobileElement otp_Titel;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND value BEGINSWITH 'נא להזין קוד אימות'")
    public  MobileElement type_otp;


    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")
    public  MobileElement WizardStepTitle;


    @Step("לחיצה אישור פופאפ העברה זהה באותו יום עסקים")
    public TransfersPage clickyesPopUp(){
        this.yesPopUp.click();
        return  this;
    }
    @Step("לחיצה על רשימת מוטבים")
    public TransfersPage click_beneficiary_list_button(){
        this.beneficiary_list_button.click();
        return  this;
    }
    @Step("לחיצה על שמירת מסך של העברה")
    public TransfersPage clickCaptureButton(){
        this.CaptureButton.click();
        return  this;
    }
    @Step("הזנת שם המוטב")
    public TransfersPage type_Name(String name)  {
        this.Name.click();
        this.Name2.sendKeys(name);
//        this.Keyboard_Return.click();
        return  this;
    }
    @Step("לחיצה על המשך")
    public TransfersPage clickAcceptButton(){
        this.AcceptButton.click();
        return  this;
    }
    @Step("לחיצה על אישור וביצוע ההעברה")
    public TransfersPage clickContinueButton(){
        this.ContinueButton.click();
        return  this;
    }
    @Step("הזנת סכום")
    public TransfersPage type_amount(String a){
        this.amount.click();
        this.amount2.sendKeys(a);
        return  this;
    }
    @Step("הזנת פרטי מוטב")
    public TransfersPage typeNumAccount(String bank,String snif)  {
        this.BranchANDbank.click();
        this.banksade.sendKeys(bank);
        this.bankNum.click();
        this.branch.sendKeys(snif);
        this.branchsade.click();
        return  this;
    }
 //   @AndroidFindBy(id = "")
   // public WebElement TitelText;



}
