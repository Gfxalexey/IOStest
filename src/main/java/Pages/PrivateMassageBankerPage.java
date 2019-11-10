package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PrivateMassageBankerPage {

    public PrivateMassageBankerPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/infoButton")
    public WebElement infoButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/callButton")
    public WebElement callButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/backButton")
    public WebElement backButton;
    @AndroidFindBy(id = "txtMessage") //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText
    public WebElement text;

}
