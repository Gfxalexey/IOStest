package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CheckBookOrderPage {

    public CheckBookOrderPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'המשך'")
    public MobileElement nextButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/BranchName")
//    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeImage' AND name  BEGINSWITH 'transfers_branch_icon'")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/**/XCUIElementTypeStaticText[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther\n")

    public MobileElement BranchNameButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]\n")
    public MobileElement random_branch;

    @AndroidFindBy(id = "com.ideomobile.discount:id/CheckOrderFindBranchEditText")

    public MobileElement BranchNamewritenum;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'אישור וביצוע הזמנה'")
    public MobileElement accept_order_Button;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")
    public MobileElement finishText;


    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public MobileElement screenCaptureButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'ביטול'")
    public MobileElement CancelButton;

    @Step("בחירת סניף לאיסוף")
    public CheckBookOrderPage typeBranche(String num) {
        this.BranchNameButton.click();
        this.BranchNamewritenum.sendKeys(num);
        this.BranchNameButton.click();
        return this;
    }

    @Step("לחיצה על אישור וביצוע הזמנה")
    public CheckBookOrderPage click_accept_order_Button() {
        this.accept_order_Button.click();
        return this;
    }
       @Step("לחיצה על כפתור המשך")
    public CheckBookOrderPage click_nextButton() {
        this.nextButton.click();
        return this;
    }

    @Step("לחיצה על צילום מסך במסך האחרון")
    public CheckBookOrderPage clickscreenCaptureButton() {
        this.screenCaptureButton.click();
        return this;
    }
}