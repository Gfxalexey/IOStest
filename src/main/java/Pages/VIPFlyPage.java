package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class VIPFlyPage {

    public VIPFlyPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/discountFontTextView13") //בא לך לטוס כמו VIP?
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  CONTAINS 'בא לך לטוס כמו'")
    public MobileElement Text1;

    @AndroidFindBy(id = "com.ideomobile.discount:id/cancelButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'סגירה'")
    public MobileElement cancelButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/actionTitle") //מתאים לך?
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'מתאים לך?'")
    public MobileElement join_vip;

    @AndroidFindBy(id = "com.ideomobile.discount:id/discountFontTextView19") //אולי מתאים לך
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH ''")
    public MobileElement tex2;

    @AndroidFindBy(id = "com.ideomobile.discount:id/actionTitle") //שווה! ספר לי עוד
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'שווה! ספרו לי עוד'")
    public MobileElement actionTitle;

    @AndroidFindBy(id = "com.ideomobile.discount:id/navigationContinueButton")//ביקת זכאות
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'בדיקת זכאות'")
    public MobileElement ContinueButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/lauferBackBtn")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'חזרה'")
    public MobileElement BackButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/firstSubTitle") //מחכים לך בחודש הבא החודש אין לך זכאות, אבל הזמן טס…
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"החודש אין לך זכאות, אבל הזמן טס... מחכים לך בחודש הבא\"]\n")
    public MobileElement firstSubTitle;

    @AndroidFindBy(id = "com.ideomobile.discount:id/actionLink") //איך זה עובד?
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'איך זה עובד? '")
    public MobileElement actionLink;


    @Step("לחיצה על מתאים לך?")
    public VIPFlyPage click_join_vip () {
        this.join_vip.click();
        return  this;
    }
        @Step("לחיצה על שווה! ספר לי עוד")
        public VIPFlyPage click_tell_me_more () {
        this.actionTitle.click();
        return  this;
    }
        @Step("לחיצה על בדיקת זכאות")
        public VIPFlyPage click_ContinueButton () {
        this.ContinueButton.click();
        return  this;
    }
    @Step("לחיצה על איך זה עובד?")
    public VIPFlyPage click_how_the_work () {
        this.actionLink.click();
        return  this;
    }
}
