package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class ChangeAccountNamePage {

    public ChangeAccountNamePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/newMainMenu_userName")
    public MobileElement change_name;
    @AndroidFindBy(id = "com.ideomobile.discount:id/ExitButton")
    public MobileElement ExitButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/FirstNameSubtitle") //איך קוראים לך באפליקציה?
    public MobileElement NameSubtitle;
    @AndroidFindBy(id = "com.ideomobile.discount:id/loginValue")
    public MobileElement edit_Text;
    @AndroidFindBy(id = "com.ideomobile.discount:id/success_ok_button")
    public MobileElement ok_button;
    @AndroidFindBy(id = "com.ideomobile.discount:id/user_pic")
    public MobileElement user_pic;

    @Step("לחיצה על שינוי שם החשבון")
    public ChangeAccountNamePage click_change_name() {
        change_name.click();
        return this;
    }
    @Step("הזנת שם חדש לחשבון")
    public ChangeAccountNamePage type_new_Name(String text) {
        edit_Text.click();
        edit_Text.sendKeys(text);
        return this;
    }
    @Step("לחיצה על אישור")
    public ChangeAccountNamePage click_Ok_Button() {
        ok_button.click();
        return this;
    }


}
