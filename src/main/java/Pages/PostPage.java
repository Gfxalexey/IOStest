package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PostPage {

    public PostPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/mail_topLayout_title\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name  BEGINSWITH 'הודעות דיסקונט'")
    public WebElement TitelText;

    @AndroidFindBy(id = "com.ideomobile.discount:id/mailActivity_exitButton\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'סגירה'")
    public WebElement Xbutton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/mail_serachLayout_calendarButton\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'חיפוש לפי תאריך'")
    public WebElement calendarButton;

    @AndroidFindBy(id = "com.ideomobile.discount:id/mail_searchBar_text\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeImage' AND name  BEGINSWITH 'text_search'")
    public WebElement searchBarButton;

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView\n")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH 'כל ההודעות'")
    public WebElement AllMassageButton;

}
