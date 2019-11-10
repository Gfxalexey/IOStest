package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.time.Duration.ofSeconds;

public class SendMassageToBranchPage {

    public SendMassageToBranchPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/contact_us_send_request_button")
    public MobileElement sendrequestbutton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/second_message_to_client")
    public MobileElement centerText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/bottomOfContactUs")
    public MobileElement bottomOfContactUs;
    @AndroidFindBy(id = "com.ideomobile.discount:id/title")
    public MobileElement titelText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormSubject")
    public MobileElement writeText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormTypeError")//שליחה ללא סוג פניה
    public MobileElement errorText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormContinueButton")
    public MobileElement continueButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/second_message_to_client") //נציגנו ישובו אליך תוך 3 ימי עסקים
    public MobileElement finishText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormType") //Kחיצה על סוג פניה
    public MobileElement sugpniya;


    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormFirstName") //
    public MobileElement firstName;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormLastname") //
    public MobileElement lastname;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormId") //
    public MobileElement id;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormPhoneAreaCode") //
    public MobileElement phoneAreaCode;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormPhoneNumber") //
    public MobileElement phoneNumber;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FillFormEmail") //
    public MobileElement email;




    @Step("בחירה של סיג הפניה")
    public SendMassageToBranchPage ChooseUreason(String text, AppiumDriver<MobileElement> driver) {
        List<MobileElement> elements = driver.findElements(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().textContains(\"" + text + "\"));"));
        elements.get(0).click();
        return  this;
    }


    @Step("לחיצה על כפתור שליחת הפניה ")
    public SendMassageToBranchPage clicksendrequestbutton() {
        sendrequestbutton.click();
        return this;

    }
        @Step("לחיצה על כפתור שליחה ")
        public SendMassageToBranchPage clickcontinueButton () {
            continueButton.click();
            return this;
        }
        @Step("כתיבת נושא הפניה ")
        public SendMassageToBranchPage typeText (String text){
            this.writeText.click();
            this.writeText.sendKeys(text);
            return this;
        }

        @Step("מילוי פרטי הפניה")
        public SendMassageToBranchPage typeAllParamMassage(String name,String lname, String id, String AreaCode,String phone, String mail,String text ){
        this.firstName.sendKeys(name);
        this.lastname.sendKeys(lname);
        this.id.sendKeys(id);
        this.email.sendKeys(mail);
        this.writeText.sendKeys(text);
        this.phoneAreaCode.sendKeys(AreaCode);
        this.phoneNumber.click();
        this.phoneNumber.sendKeys(phone);
        return  this;
        }
    }