package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class AllActionPage {

    public AllActionPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"מייל לבנקאי\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'משיכה מפיקדון'")
    public MobileElement mailToBankerButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הזמנת פנקסי שיקים'")
    public MobileElement OrderChecksBook;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה בין חשבונות\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'העברה בין חשבונות'")
    public MobileElement transferButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה לאיש קשר\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'העברה לאיש קשר'")
    public MobileElement transferFriendButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה עתידית\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'העברה עתידית'")
    public MobileElement futureTransfer;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה מחזורית (הוראת קבע)\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'העברה מחזורית (הוראת קבע)'")
    public MobileElement transferHok;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ביטול העברה עתידית / הו\"ק\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'ביטול העברה עתידית / הו\"ק'")
    public MobileElement cancelhokButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"משיכת מזומן ללא כרטיס\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'משיכת מזומן ללא כרטיס'")
    public MobileElement cashWithdrawal;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"שליחת מזומן לאיש קשר\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שליחת מזומן לאיש קשר'")
    public MobileElement sendMoneyFriend;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הגדלת סכום משיכת מזומן\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הגדלת סכום משיכת מזומן'")
    public MobileElement increase_amount;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"המרת מט\"ח\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'המרת מט&quot;ח'")
    public MobileElement foreignConversion;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברת מט\"ח\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'העברת מט\"ח'")
    public MobileElement foreignTransfer;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הפקדת שיק\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הפקדת שיק'")
    public MobileElement depositCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הזמנת פנקסי שיקים\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'הזמנת פנקסי שיקים'")
    public MobileElement orderChecksBook;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ביטול שיקים\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'משיכה מפיקדון'")
    public MobileElement cancelCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"בקשת הלוואה\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'בקשת הלוואה'")
    public MobileElement getLoan;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'משיכה מפיקדון'")

    public  MobileElement withdrawalDeposit;
}
