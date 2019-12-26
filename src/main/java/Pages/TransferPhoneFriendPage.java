package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.time.Duration.ofSeconds;

public class TransferPhoneFriendPage {

    public TransferPhoneFriendPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/sendToFriendContactNameTextView") //
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'בחירת איש קשר  לחץ לעריכה'")
    public WebElement friendContactName;

    @AndroidFindBy(id = "com.ideomobile.discount:id/contactName") //

    public List contactName;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button") //

    public WebElement permissionallowbutton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton") //
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'שמירה כתמונה'")
    public WebElement CaptureButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\n") //
    public WebElement searchName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[2]\n") //
    public WebElement searchName1;

    @AndroidFindBy(id = "com.ideomobile.discount:id/contactListCloseButton") //
    public WebElement contactListCloseButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/contactPhone") //

    public WebElement phone;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton") // כפתור המשך
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'המשך'")
    public WebElement ContinueButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'המשך לשלב הבא'")
    public WebElement board_continueButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'אישור וביצוע ההעברה'")
    public WebElement accept_ContinueButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/send_to_friend_amount_displayed_text_view") // הזנת סכום
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'הזנת סכום'")
    public WebElement amoun;

    @AndroidFindBy(id = "com.ideomobile.discount:id/transfer_set_amount_edit_text") // הזנת סכום
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField'")
    public WebElement amoun1;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton") // i
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'הבהרות'")
    public WebElement NoticeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Kobi\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value  BEGINSWITH '052-2222222'")
    public WebElement kobiPhone;


    @Step("הזנת סכום")
    public TransferPhoneFriendPage type_amoun(String num){
        this.amoun.click();
        this.amoun1.sendKeys(num);
        return  this;
    }

    @Step("לחיצה על המשך")
    public TransferPhoneFriendPage clickContinueButton(){
        this.ContinueButton.click();
        return this;
    }
    @Step("לחיצה על אישור וביצוע ההעברה")
    public TransferPhoneFriendPage click_Accept_ContinueButton(){
        this.accept_ContinueButton.click();
        return this;
    }
    @Step("ביצוע הדפסת מסך")
    public TransferPhoneFriendPage clickCaptureButton(){
        this.CaptureButton.click();
        return this;
    }
    @Step("לחיצה על בחירה מאנשי הקשר")
    public TransferPhoneFriendPage SelectFromPhone(){
        this.friendContactName.click();
        return this;
    }
    @Step("אישור צפייה באנשי קשר")
    public TransferPhoneFriendPage cliclpermissionallowbutton(){
        this.permissionallowbutton.click();
        return this;
    }
@Step("כתיבת שם איש קשר")
    public TransferPhoneFriendPage typeNameFriend(String name) {
        this.searchName.click();
        this.searchName.sendKeys(name);
    return this;
}
@Step("בחירה של שם")
    public TransferPhoneFriendPage clickNameFriend(){
        this.searchName1.click();
        return  this;

}

}
