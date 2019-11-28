package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class LoginPage {


    public LoginPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"כניסה\"]\n")
    public MobileElement EnterButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"תעודת זהות\"]/android.widget.LinearLayout/android.widget.EditText\n")
    public MobileElement typeID;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"סיסמה\"]/android.widget.LinearLayout/android.widget.EditText\n")
    public MobileElement typePAS;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"קוד מזהה\"]/android.widget.LinearLayout/android.widget.EditText\n")
    public MobileElement typeCODE;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"כניסה לאפליקציית דיסקונט\"]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[2]\n")
    public MobileElement ForgotPassButton;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"כניסה לאפליקציית דיסקונט\"]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]\n")
    public MobileElement ForgotCodeButton;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement AllowButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/BotWalkMeClose")
    public MobileElement Close_didiTutorial;


    @AndroidFindBy(id = "com.ideomobile.discount:id/login_snapshot_icon")
    public  MobileElement arrowsnapshot;
    @AndroidFindBy(id = "com.ideomobile.discount:id/LoginClosedSnapshotTitleTextView")
    public  MobileElement snapshot;
    @AndroidFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_transferLayout")
    public  MobileElement quicktransfer;
    @AndroidFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_withdrawalLayout")
    public  MobileElement  quickwithdrawal;
    @AndroidFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_checkDepositLayout")
    public  MobileElement quickcheckDeposit;
    @AndroidFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_loanRequestLayout")
    public  MobileElement  quickloan;
    @AndroidFindBy(id = "com.ideomobile.discount:id/snapshotLayout_quickLook_ButtonLayout")
    public  MobileElement  login_snapshot_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/snapshotOshAmountText")
    public  MobileElement  snapshotOshAmount;
    @AndroidFindBy(id = "com.ideomobile.discount:id/HelloUser")
    public  MobileElement  HelloUser;

@Step("לחיצה על העברות מדף לוגין")
public LoginPage clickquicktransfer(){
    this.quicktransfer.click();
    return  this;
}

@Step("לחיצה על מבט זריז מדף לוגין")
public LoginPage clickarrowsnapshot() {
    this.arrowsnapshot.click();
    return this;
}
@Step("לחיצה על משיכה ללא כרטיס מדף לוגין")
public LoginPage clickquickwithdrawal() {
    this.quickwithdrawal.click();
    return this;
}
@Step("לחיצה על הפקדת שיק מדף לוגין")
public LoginPage clickquickcheckDeposit() {
    this.quickcheckDeposit.click();
    return this;
}
@Step("לחיצה על בקשת הלוואה מדף לוגין")
public LoginPage clicgetquickloan() {
    this.quickloan.click();
    return this;
}

    @Step("ביצוע לוגאין")
    public LoginPage loginsucces(String id, String pass, String code) {
        typeID.sendKeys(id);
        typePAS.sendKeys(pass);
        typeCODE.sendKeys(code);
        EnterButton.click();
        return this;
    }

    @Step("ביצוע לוגאין עם סיסמא בלבד")
    public LoginPage loginsuccesOnlyPass(String pass) {
        typePAS.sendKeys(pass);
        EnterButton.click();
        return this;
    }

}



