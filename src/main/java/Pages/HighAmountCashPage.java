package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class HighAmountCashPage {

    public HighAmountCashPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/change_limit_no_cards_x_button")
    MobileElement X_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/change_limit_no_cards_text")// נראה שאין לך בחשבון כרטיס שניתן לבצע בו משיכה מוגדלת
    MobileElement No_Card_Text;
    @AndroidFindBy(id = "com.ideomobile.discount:id/change_limit_no_cards_subtitle")  //אין כרטיסים
    MobileElement No_Card_Subtitel;
    @AndroidFindBy(id = "com.ideomobile.discount:id/change_limit_no_cards_upper_title")  //הגדלת סכום משיכת מזומן
    MobileElement No_Cards_Upper_Title;



}