package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CreditCardPage {
    public CreditCardPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/NavBarTitle")  //כרטיסי אשראי
    public WebElement titel;
    @AndroidFindBy(id = "com.ideomobile.discount:id/summary_fragment_title")  //סה"כ לחיוב הקרוב
    public WebElement summary_fragment_title;
    @AndroidFindBy(id = "com.ideomobile.discount:id/credit_framework_title")  //סך יתרה לניצול
    public WebElement credit_framework_title;
    @AndroidFindBy(id = "com.ideomobile.discount:id/creditCardLastFourDigitsItem")  //
    public WebElement creditCardLastFourDigitsItem;
    @AndroidFindBy(id = "com.ideomobile.discount:id/infoButton")  //כפתור i
    public WebElement infoButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/next_billing_text")  //חיוב קרוב
    public WebElement next_billing;
    @AndroidFindBy(id = "com.ideomobile.discount:id/previous_billing_button")  //כפתור i
    public WebElement previous_billing;
    @AndroidFindBy(id = "com.ideomobile.discount:id/x_button")  //x_button
    public WebElement x_button;
}
