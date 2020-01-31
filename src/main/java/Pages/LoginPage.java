package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class LoginPage {


    public LoginPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @iOSXCUITFindBy(accessibility = "כניסה לחשבונך")
    public MobileElement EnterButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name  BEGINSWITH 'תעודת זהות'")
    public MobileElement typeID;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeSecureTextField' AND name  BEGINSWITH 'סיסמה'")
    public MobileElement typePAS;

//    @iOSXCUITFindBy(accessibility  = "סיסמה")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name  BEGINSWITH 'קוד מזהה'")
    public MobileElement typeCODE;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'החלפת משתמש'")
    public MobileElement changeUser;



    @iOSXCUITFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"כניסה לאפליקציית דיסקונט\"]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[2]\n")
    public MobileElement ForgotPassButton;

    @iOSXCUITFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"כניסה לאפליקציית דיסקונט\"]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]\n")
    public MobileElement ForgotCodeButton;
    @iOSXCUITFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement AllowButton;
    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/BotWalkMeClose")
    public MobileElement Close_didiTutorial;

//    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'מבט זריז'")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]\n")
    public  MobileElement arrowsnapshot;
    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/LoginClosedSnapshotTitleTextView")
    public  MobileElement snapshot;
    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_transferLayout")
    public  MobileElement quicktransfer;
    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_withdrawalLayout")
    public  MobileElement  quickwithdrawal;
    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_checkDepositLayout")
    public  MobileElement quickcheckDeposit;
    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/loginScreen_quickActions_loanRequestLayout")
    public  MobileElement  quickloan;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]\n")
//    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'מבט זריז'")
    public  MobileElement  login_snapshot_button;

    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/snapshotOshAmountText")
    public  MobileElement  snapshotOshAmount;

    @iOSXCUITFindBy(id = "com.ideomobile.discount:id/HelloUser")
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

@Step("לחיצה על החלפת משתמש")
public LoginPage click_changeUser() {
    this.changeUser.click();
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



