package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class CheckBookOrderPage {

    public CheckBookOrderPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public MobileElement nextButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/BranchName")
    public MobileElement BranchNameButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CheckOrderFindBranchEditText")
    public MobileElement BranchNamewritenum;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardContinueButton")
    public MobileElement finishButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardStepTitle")
    public MobileElement finishText;
    @AndroidFindBy(id = "com.ideomobile.discount:id/WizardScreenCaptureButton")
    public MobileElement screenCaptureButton;
    @AndroidFindBy(id = "com.ideomobile.discount:id/CancelButton")
    public MobileElement CancelButton;

    @Step("בחירת סניף לאיסוף")
    public CheckBookOrderPage typeBranche(String num) {
        this.BranchNameButton.click();
        this.BranchNamewritenum.sendKeys(num);
        this.BranchNameButton.click();
        return this;
    }

    @Step("לחיצה על כפתור המשך")
    public CheckBookOrderPage clicknextButton() {
        this.nextButton.click();
        return this;
    }
    @Step("לחיצה על כפתור אישור וביצוע ההזמנה")
    public CheckBookOrderPage clickfinishButton() {
        this.finishButton.click();
        return this;
    }
    @Step("לחיצה על צילום מסך במסך האחרון")
    public CheckBookOrderPage clickscreenCaptureButton() {
        this.screenCaptureButton.click();
        return this;
    }
}