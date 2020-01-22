package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class MyProfilePage {

    public MyProfilePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/my_profile_title")
    MobileElement My_Profile_Titel;
    @AndroidFindBy(id = "com.ideomobile.discount:id/my_profile_edit_email_button")
    MobileElement my_profile_edit_email_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/my_profile_address_info_icon")
    MobileElement my_profile_address_info_icon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"טלפון נייד\")")
    public MobileElement Pelephone;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"הסניף שלי\")")
    @iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'הסניף שלי'")
    public MobileElement My_Branch;


}
