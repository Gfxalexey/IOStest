package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class StockPage {

    public StockPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardTitle")  //קניית נייר ערך
    public MobileElement WizardTitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")  //
    public MobileElement CancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardLegalNoticeButton")  //
    public MobileElement WizardLegalNoticeButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardRefreshIcon")  //
    public MobileElement WizardRefreshIcon;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsTransactionValueDisplay")  //שווי עסקה בש"ח
    public MobileElement TransactionValue;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsRequestedUnitsDisplay")  //כמות מבוקשת
    public MobileElement RequestedUnits;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsRequestedUnitsEdit")  //כמות מבוקשת
    public MobileElement EditRequestedUnits;

    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsRateLimitPriceDisplay")  //הגבלת שער במחיר
    public MobileElement RateLimit;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsRateLimitPriceEdit")  //הגבלת שער במחיר
    public MobileElement EditRateLimit;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsRateLimitPercentDisplay")  //הגבלת שער באחוזים
    public MobileElement RateLimitPercent;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsCurrentPrice")  //שער נוכחי:
    public MobileElement SecurityOperationDetailsCurrentPrice;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsExpirationDate")  //תוקף הוראה
    public MobileElement ExpirationDate;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")  //המשך
    public MobileElement ContinueButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/SecurityOperationDetailsDefaultTradeStageToDisplay")  //שלב מסחר
    public MobileElement TradeStage;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    public MobileElement screenCaptureButton;
    @AndroidFindBy(className = "android.widget.EditText")  //
    public MobileElement www;
    @AndroidFindBy(id = "com.ideomobile.discount:id/error_positive_button")  //
    public MobileElement positive_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")  //
    public MobileElement ScreenCaptureButton;


    @Step("לחיצה על אישור שמירת מסך ")
    public  StockPage click_WizardScreenCaptureButton(){
        ScreenCaptureButton.click();
        return this;
    }
    @Step("לחיצה על אישור של תנודת 10 אחוז ")
    public  StockPage click_positive_button(){
        this.positive_button.click();
        return this;
    }

    @Step("הזנה של הגבלת שער")
    public  StockPage type_units(String unit){
        this.RequestedUnits.click();
        this.EditRequestedUnits.sendKeys(unit);
        return  this;
    }
    @Step("הזנה של הגבלת שער")
    public  StockPage type_RateLimit(String limit) throws InterruptedException {
        this.RateLimit.click();
        this.EditRateLimit.sendKeys(limit);
        return  this;
    }
    @Step("לחיצה על המשך לשלב הבא")
    public  StockPage click_ContinueButton(){
        this.ContinueButton.click();
        return  this;
    }
    @Step("לחיצה על שמירת צילום מסך")
    public  StockPage click_screenCaptureButton(){
        this.screenCaptureButton.click();
        return  this;
    }


}
