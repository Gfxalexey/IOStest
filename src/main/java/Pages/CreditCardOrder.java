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

public class CreditCardOrder {

    public CreditCardOrder(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'ביטול'")
    public WebElement cancelButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'המשך'")
    public WebElement continueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ויזה בינלאומי\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH 'ויזה בינלאומי'")
    public WebElement visacardButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"דיינרס Fly Card\")")
    public WebElement flycardButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderEnglishNameEditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'שם מלא באנגלית'")
    public WebElement cardname;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField'")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"בנק דיסקונט\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")

    public WebElement type_cardname;

    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderDebitDateButton1")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH '10'")
    public WebElement dateButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderTermsTransferToggleButtonNo")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH 'לא תודה'")
    public WebElement toggleButtonNo;

    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderTermsCheckBox")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'לאישור לחץ כאן'")
    public WebElement checkBox;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardBackButton")
    public WebElement backButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'שמירה כתמונה'")
    public WebElement captureButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderEnglishNameErrorMessage")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH 'יש להזין שם באותיות באנגלית'")
    public WebElement errorname;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement AllowButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'המשך לשלב הבא'")
    public WebElement board_continue;

    //-------------------------------------------------------------------------------------------------------------------------
  @Step("בחירת כרטיס להזמנה ויזה בנלאומית")
  public  CreditCardOrder click_visacard_Button(){
      this.visacardButton.click();
      return  this;
  }
  @Step("בחירת כרטיס להזמנה ויזהFly Card  ")
  public  CreditCardOrder clickflycardButton(){
      this.flycardButton.click();
      return  this;
  }
  @Step(" לחיצה על המשך לשלב הבא  ")
  public  CreditCardOrder click_continue_Button(){
      this.continueButton.click();
      return  this;
  }
    @Step(" לחיצה על המשך לשלב הבא 2/5 ")
    public  CreditCardOrder click_continueButton1(){
        this.continueButton.click();
        return  this;
    }
    @Step(" לחיצה על המשך לשלב הבא 3/5 ")
    public  CreditCardOrder clickcontinueButton3(){
        this.continueButton.click();
        return  this;
    }
 @Step(" לחיצה על אישור סופי ")
    public  CreditCardOrder clickcontinueButton4(){
        this.continueButton.click();
        return  this;
    }

    @Step(" לחיצה על הדפסה של העסקה ")
    public  CreditCardOrder click_captureButton(){
        this.captureButton.click();
        return  this;
    }
    @Step(" לחיצה על אחורה ")
    public  CreditCardOrder clickbackButton(){
        this.backButton.click();
        return  this;
    }
    @Step(" הזנת שם של בעל הכרטיס ")
    public  CreditCardOrder type_cardname(String name){
        this.cardname.click();
        this.type_cardname.sendKeys(name);
        return  this;
    }
    @Step(" הזנת שם שגוי ")
    public  CreditCardOrder typeErrorcardname(String name){
        this.cardname.click();
        this.type_cardname.sendKeys(name);
        return  this;
    }
    @Step(" לחיצה על לא להעברת כל העסקאות לכרטיס ")
    public  CreditCardOrder click_toggleButtonNo(){
        this.toggleButtonNo.click();
        return  this;
    }
    @Step(" לחיצה צ'קבוקס ")
    public  CreditCardOrder click_checkBox(){
        this.checkBox.click();
        return  this;
    }
    @Step(" בחירה של תאריך חיוב ")
    public  CreditCardOrder click_dateButton(){
        this.dateButton.click();
        return  this;
    }

    @Step(" בחירה של תאריך חיוב ")
    public  CreditCardOrder getErrortext(){
        this.errorname.getText();
        return  this;
    }
}

