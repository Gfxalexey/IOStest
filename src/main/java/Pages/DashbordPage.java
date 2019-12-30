package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class DashbordPage {
    public DashbordPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"מצב החשבון שלי חשבון מספר \"]\n")
    @iOSXCUITFindBy(accessibility = "כניסה לחשבונך")
    public MobileElement TitelText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/TutorialSkip")
    @iOSXCUITFindBy(accessibility = "סגירה")
    public MobileElement TutorialSkip;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"עובר ושב\"]\n")
    public MobileElement OshText;


    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"תפריט\"]\n")
    public MobileElement HamburgerButton2;

    @AndroidFindBy(id = "com.ideomobile.discount:id/MenuButton")
    @iOSXCUITFindBy(accessibility = "פתיחת תפריט")
    public MobileElement HamburgerButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"כרטיס אשראי\"]\n")
    public MobileElement CreditCardsText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"ניירות ערך\"]\n")
    public MobileElement SecuritiesText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"הלוואות\"]\n")
    public MobileElement LoansText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"פקדונות וחסכונות\"]\n")
    public MobileElement DepositsText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"מטבע חוץ\"]\n")
    public MobileElement ForeignText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"משכנתאות\"]\n")
    public MobileElement MortageText;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"דואר דיסקונט\"]\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'הודעות דיסקונט'")
    public MobileElement PostButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"דף הבית\"]\n")
    public MobileElement HomeButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_chooseAccountArrow")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'החלפת חשבון'")
    public MobileElement chooseAcoountButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_accountNumber")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name  BEGINSWITH 'מצב החשבון שלי'")
    public MobileElement accountNumber;

    @AndroidFindBy(id = "com.ideomobile.discount:id/menuButtonToAll")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'כל הפעולות'")
    public MobileElement allaction;

    @AndroidFindBy(id = "com.ideomobile.discount:id/error_negative_button")
    public MobileElement negative_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_MyProfile_layout")
    public MobileElement MyProfile_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/bannerImageImageView")
    @iOSXCUITFindBy(accessibility = "סגירה")
    public MobileElement Banner;
//    @AndroidFindBy(id = "com.ideomobile.discount:id/bannerImageMainButtonX")
//    public MobileElement Banner_X_Button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_myInsights_title")
    public MobileElement myInsights;
    @AndroidFindBy(id = "com.ideomobile.discount:id/bannerImageMainButtonX")
    public MobileElement bannerImageMainButtonX;
    @AndroidFindBy(id = "com.ideomobile.discount:id/DashboardButton")
    public MobileElement Dashboard_Home_Button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_settingsButton")
    public MobileElement settingsButton;


    //-------------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"הפקדה לפיקדון\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הפקדה לפיקדון'")
    public MobileElement openDepositButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"יתרת עו\"ש\")")
    public MobileElement balanceOfAccount;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה בין חשבונות\")")
//    @iOSXCUITFindBy(accessibility = " העברה בין חשבונות")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'העברה בין חשבונות'")
    public MobileElement transferButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"בקשת הלוואה\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'בקשת הלוואה'")
    public MobileElement LoanButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה לאיש קשר\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'העברה לאיש קשר'")
    public MobileElement transferFriendCashButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"משיכת מזומן ללא כרטיס\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'משיכת מזומן ללא כרטיס'")
    public MobileElement cashWithdrawalButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"המרת מט\"ח\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המרת מטֿ/״ח'")
    public MobileElement foreignConversionsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"עובר ושב\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'עובר ושב'")
    public MobileElement oshLobbyButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"כרטיסי אשראי\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'כרטיסי אשראי'")
    public MobileElement creditCardButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"שוק ההון\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שוק ההון'")
    public MobileElement capitalMarketButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הלוואות\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הלוואות'")
    public MobileElement loansButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"התכתבות עם בנקאי\")")
    public MobileElement massageToBankerButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"דִידִי – הנציגה הדיגיטלית\")")
    public MobileElement didiButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"פגישה עם בנקאי\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'פגישה עם בנקאי חדש'")
    public MobileElement meetingBankerButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"מייל לבנקאי\")")
    public MobileElement mailToBankerButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הלוואות\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'הלוואות'")
    public MobileElement dashLoanMenu;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"תיק ניירות ערך\")")
    public MobileElement TradeLobby;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'אודות ואבטחת מידע'")
    public  MobileElement about_Us_security;

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  CONTAINS 'VIP'")
    public  MobileElement VIP;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]/**/XCUIElementTypeStaticText[3]")
    public  MobileElement num_3;


    @Step("לחיצה על פגישה עם בנקאי")
    public DashbordPage click_meetingBankerButton() {
        meetingBankerButton.click();
        return this;
    }
    @Step("לחיצה על תיק ניירות ערך")
    public DashbordPage click_TradeLobby() {
        TradeLobby.click();
        return this;
    }
    @Step("לחיצה על תפריט")
    public DashbordPage click_HamburgerButton() {
        HamburgerButton.click();
        return this;
    }
    @Step("לחיצה על פרופיל שלי")
    public DashbordPage click_MyProfile_button() {
        MyProfile_button.click();
        return this;
    }
    @Step("לחיצה על הפקדה לפיקדון חדש")
    public DashbordPage click_openDepositButton() {
        openDepositButton.click();
        return this;
    }

    @Step("לחיצה על העברה לאיש קשר")
    public DashbordPage clicktransferFriendCashButton() {
        transferFriendCashButton.click();
        return this;

    }
    @Step("לחיצה על הלוואות מדשבורד")
    public DashbordPage clickdashLoanMenu() {
        dashLoanMenu.click();
        return this;

    }

    @Step("לחיצה על כל הפעולות בתפריט")
    public DashbordPage clickallaction() {
        allaction.click();
        return this;
    }
    @Step("לחיצה על העברות")
    public DashbordPage clicktransferButton() {
        transferButton.click();
        return this;
    }
@Step("לחיצה על בקשת הלוואה בתפריט")
    public DashbordPage clickgetLoanButton() {
    LoanButton.click();
        return this;
    }
@Step("לחיצה על חץ של בחירת חשבון")
    public DashbordPage clickchooseAcoountButton() {
    chooseAcoountButton.click();
        return this;
    }
    @Step("לחיצה על דשבורד כרטיסים")
    public DashbordPage click_creditCardButton() {
        creditCardButton.click();
        return this;
    }


}