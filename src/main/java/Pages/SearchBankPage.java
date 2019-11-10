package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchBankPage {
    public SearchBankPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public WebElement allowbutton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"סניפים נגישים\")")
    public WebElement branchesNagish;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"כספומט הפקדת מזומן\")")
    public WebElement cashAtm;



}
