package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PostPage {

    public PostPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/mail_topLayout_title\n")
    public WebElement TitelText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/mailActivity_exitButton\n")
    public WebElement Xbutton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/mail_serachLayout_calendarButton\n")
    public WebElement calendarButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/mail_searchBar_text\n")
    public WebElement searchBarButton;
    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView\n")
    public WebElement AllMassageButton;

}
