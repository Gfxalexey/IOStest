package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class AllActionPage {

    public AllActionPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"מייל לבנקאי\")")
    public MobileElement mailToBankerButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה בין חשבונות\")")
    public MobileElement transferButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה לאיש קשר\")")
    public MobileElement transferFriendButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ההעברה לאיש קשר\")")
    public MobileElement futureTransfer;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברה מחזורית (הוראת קבע)\")")
    public MobileElement transferHok;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ביטול העברה עתידית / הו\"ק\")")
    public MobileElement cancelhokButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"משיכת מזומן ללא כרטיס\")")
    public MobileElement cashWithdrawal;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"שליחת מזומן לאיש קשר\")")
    public MobileElement sendMoneyFriend;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הגדלת סכום משיכת מזומן\")")
    public MobileElement increase_amount;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"המרת מט\"ח\")")
    public MobileElement foreignConversion;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"העברת מט\"ח\")")
    public MobileElement foreignTransfer;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הפקדת שיק\")")
    public MobileElement depositCheck;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הזמנת פנקסי שיקים\")")
    public MobileElement orderChecksBook;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ביטול שיקים\")")
    public MobileElement cancelCheck;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"בקשת הלוואה\")")
    public MobileElement getLoan;

}
