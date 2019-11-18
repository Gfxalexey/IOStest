package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    public MobileElement TitelText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/TutorialSkip")
    public MobileElement TutorialSkip;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"עובר ושב\"]\n")
    public MobileElement OshText;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"תפריט\"]\n")
    public MobileElement HamburgerButton2;
    @AndroidFindBy(id = "com.ideomobile.discount:id/MenuButton")
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
    public MobileElement PostButton;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"דף הבית\"]\n")
    public MobileElement HomeButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_chooseAccountArrow")
    public MobileElement chooseAcoountButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_accountNumber")
    public MobileElement accountNumber;
    @AndroidFindBy(id = "com.ideomobile.discount:id/menuButtonToAll")
    public MobileElement allaction;
    @AndroidFindBy(id = "com.ideomobile.discount:id/error_negative_button")
    public MobileElement negative_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_MyProfile_layout")
    public MobileElement MyProfile_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/bannerImageImageView")
    public MobileElement Banner;
//    @AndroidFindBy(id = "com.ideomobile.discount:id/bannerImageMainButtonX")
//    public MobileElement Banner_X_Button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_myInsights_title")
    public MobileElement myInsights;
    @AndroidFindBy(id = "com.ideomobile.discount:id/bannerImageMainButtonX")
    public MobileElement bannerImageMainButtonX;
    @AndroidFindBy(id = "com.ideomobile.discount:id/DashboardButton")
    public MobileElement Dashboard_Home_Button;


    //-------------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"הפקדה לפיקדון\")")
    public MobileElement openDepositButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"יתרת עו\"ש\")")
    public MobileElement balanceOfAccount;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה בין חשבונות\")")
    public MobileElement transferButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"בקשת הלוואה\")")
    public MobileElement LoanButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה לאיש קשר\")")
    public MobileElement transferFriendCashButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"משיכת מזומן ללא כרטיס\")")
    public MobileElement cashWithdrawalButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"המרת מט\"ח\")")
    public MobileElement foreignConversionsButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"עובר ושב\")")
    public MobileElement oshLobbyButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"כרטיסי אשראי\")")
    public MobileElement creditCardButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"שוק ההון\")")
    public MobileElement capitalMarketButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הלוואות\")")
    public MobileElement loansButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"התכתבות עם בנקאי\")")
    public MobileElement massageToBankerButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"דִידִי – הנציגה הדיגיטלית\")")
    public MobileElement didiButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"פגישה עם בנקאי\")")
    public MobileElement meetingBankerButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"מייל לבנקאי\")")
    public MobileElement mailToBankerButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הלוואות\")")
    public MobileElement dashLoanMenu;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"תיק ניירות ערך\")")
    public MobileElement TradeLobby;



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