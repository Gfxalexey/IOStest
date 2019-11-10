package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CreditCardOrder {

    public CreditCardOrder(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    public WebElement cancelButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public WebElement continueButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ויזה בינלאומי\")")
    public WebElement visacardButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"דיינרס Fly Card\")")
    public WebElement flycardButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderEnglishNameEditText")
    public WebElement cardname;
    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderDebitDateButton1")
    public WebElement dateButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderTermsTransferToggleButtonNo")
    public WebElement toggleButtonNo;
    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderTermsCheckBox")
    public WebElement checkBox;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardBackButton")
    public WebElement backButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    public WebElement captureButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardOrderEnglishNameErrorMessage")
    public WebElement errorname;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement AllowButton;
//-------------------------------------------------------------------------------------------------------------------------
  @Step("בחירת כרטיס להזמנה ויזה בנלאומית")
  public  CreditCardOrder clickvisacardButton(){
      this.visacardButton.click();
      return  this;
  }
  @Step("בחירת כרטיס להזמנה ויזהFly Card  ")
  public  CreditCardOrder clickflycardButton(){
      this.flycardButton.click();
      return  this;
  }
  @Step(" לחיצה על המשך לשלב הבא 1/5 ")
  public  CreditCardOrder clickcontinueButton(){
      this.continueButton.click();
      return  this;
  }
    @Step(" לחיצה על המשך לשלב הבא 2/5 ")
    public  CreditCardOrder clickcontinueButton1(){
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
    public  CreditCardOrder clickcaptureButton(){
        this.captureButton.click();
        return  this;
    }
    @Step(" לחיצה על אחורה ")
    public  CreditCardOrder clickbackButton(){
        this.backButton.click();
        return  this;
    }
    @Step(" הזנת שם של בעל הכרטיס ")
    public  CreditCardOrder typecardname(String name){
        this.cardname.click();
        this.cardname.sendKeys(name);
        return  this;
    }
    @Step(" הזנת שם שגוי ")
    public  CreditCardOrder typeErrorcardname(String name){
        this.cardname.click();
        this.cardname.sendKeys(name);
        return  this;
    }
    @Step(" לחיצה על לא להעברת כל העסקאות לכרטיס ")
    public  CreditCardOrder clicktoggleButtonNo(){
        this.toggleButtonNo.click();
        return  this;
    }
    @Step(" לחיצה צ'קבוקס ")
    public  CreditCardOrder clickcheckBox(){
        this.checkBox.click();
        return  this;
    }
    @Step(" בחירה של תאריך חיוב ")
    public  CreditCardOrder clickdateButton(){
        this.dateButton.click();
        return  this;
    }

    @Step(" בחירה של תאריך חיוב ")
    public  CreditCardOrder getErrortext(){
        this.errorname.getText();
        return  this;
    }
}

