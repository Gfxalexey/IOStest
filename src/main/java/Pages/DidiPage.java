package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class DidiPage {
    public DidiPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }
    @AndroidFindBy(id = "com.ideomobile.discount:id/botQuestionEditText")
    public MobileElement Didi_Edit_text;
    @AndroidFindBy(id = "com.ideomobile.discount:id/botSendQuestionButton_image")
    public MobileElement SendQuestionButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/botErrorAnswerTextView")
    public MobileElement AnswerText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/botRightButtonLayout")
    public MobileElement botActionButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/botBalanceAllTransactionsTextView")
    public MobileElement botBalanceAllTransactions;
    @AndroidFindBy(id = "com.ideomobile.discount:id/amount")
    public MobileElement botBalanceamount;



    @Step("כתיבת שאלה לדידי")
    public DidiPage type_Question(String text) {
        Didi_Edit_text.click();
        Didi_Edit_text.sendKeys(text);
        SendQuestionButton.click();
        return this;
    }

}
