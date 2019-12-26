package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.time.Duration.ofSeconds;

public class LoansPage {
    AppiumDriver<MobileElement> driver;

    public LoansPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(12)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"דף הבית\"]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout\n")
    public WebElement plusButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"הלואה לא צמודה ברבית קבועה \")")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]\n")
//    @iOSXCUITFindBy(iOSNsPredicate= "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'הלואה לא צמודה ברבית קבועה ' AND enabled == 1")
    public WebElement nameLoan;

    @AndroidFindBy(id = "com.ideomobile.discount:id/getLoanAmountTextButton")

    public WebElement getPlusButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/LoanDetailsBoardButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'לוח סילוקין'")
    public WebElement loanDetailsBoardButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/x_button")

    public WebElement xButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/infoButton")

    public WebElement infoButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public WebElement CaptureButton;

   @Step("לחיצה על על הלוואה פרטנית")
        public LoansPage clicknameLoan() {
            nameLoan.click();
            return this;
        }
   @Step("לחיצה על לוח סילוקין")
        public LoansPage clickloanDetailsBoardButton() {
        loanDetailsBoardButton.click();
            return this;
        }
@Step("לחיצה על כפתור X")
        public LoansPage clickxButton() {
        xButton.click();
            return this;
        }
@Step("לחיצה על כפתור i")
        public LoansPage clickinfoButton() {
        infoButton.click();
            return this;
        }



}