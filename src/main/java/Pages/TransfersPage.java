package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    public WebElement TitelText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton\n")
    public WebElement CancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle\n")//למי להעביר?
    public WebElement Titel2Text;
    @AndroidFindBy(id = "com.ideomobile.discount:id/choose_beneficiary_from_beneficiary_list_button")//או בחרו מרשימה/ מהעברה קודמת
    public WebElement beneficiary_list_button;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    public WebElement ContinueButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/transfers_beneficiary_name_text\n")
    public WebElement BeneficiaryNameText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/choose_beneficiary_next_step_button\n")
    public WebElement BoardNextButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")
    public WebElement Name;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView\n")
    public WebElement BranchANDbank;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText\n")
    public WebElement banksade;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout\n")
    public WebElement bankNum;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\n")
    public WebElement branch;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout\n")
    public WebElement branchsade;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout\n")
    public WebElement mauthavara;
    @AndroidFindBy(id = "com.ideomobile.discount:id/TransfersBankAccountNumber\n")
    public WebElement mauthavara2;
    @AndroidFindBy(id = "com.ideomobile.discount:id/TransfersBankAccountNumber")
    public WebElement accountnum;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    public WebElement nextbutton2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView\n")
    public WebElement amount;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button\n")
    public WebElement AcceptButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView\n")
    public WebElement finishText;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")
    public WebElement amount2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]\n")
    public WebElement contAmoun;
    @AndroidFindBy(id = "com.ideomobile.discount:id/error_positive_button")
    public WebElement yesPopUp;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    public WebElement CaptureButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/transfers_client_confirmation_amount")
    public  MobileElement ConfirmationAmount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/ofp_continue_button")
    public  MobileElement otp_continue_button;
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
    public TransfersPage typeName(String name){
        this.Name.click();
       this.Name.sendKeys(name);
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
    public TransfersPage typeamount(String a){
        this.amount2.sendKeys(a);
        return  this;
    }
    @Step("הזנת פרטי מוטב")
    public TransfersPage typeNumAccount(String bank,String snif) throws InterruptedException {
        this.BranchANDbank.click();
        this.banksade.sendKeys(bank);
        this.bankNum.click();
        this.branch.sendKeys(snif);
        this.branchsade.click();
//        this.accountnum.clear();
//        this.accountnum.sendKeys(account);
        //this.nextbutton2.click();
        return  this;
    }
 //   @AndroidFindBy(id = "")
   // public WebElement TitelText;



}
