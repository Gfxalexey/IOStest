package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class ChangeAccountPage {
    public ChangeAccountPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/ExitButton")
    public WebElement exitButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"שלום שלום שלום שלום שלום שלום שלום\")")
    public WebElement newAccount;


    @Step("בחירה של חשבון אחר ברשימה")
    public ChangeAccountPage clicknewAccount() {
        newAccount.click();
        return this;
    }
}
