package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;


    public class AboutAplicationPage {
        public AboutAplicationPage(AppiumDriver driver) {
            PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
        }

        @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'אודות'")
        public MobileElement aboutButton;

        @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'אבטחת מידע'")
        public MobileElement security;

        @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH 'סגירה'")
        public MobileElement closeButton;
        @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name  BEGINSWITH '03-9439191'")
        public MobileElement number;
        @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH 'א'-ה' בין השעות 08:00 – 19:00 ו' וערבי חג בין השעות 08:00 – 13:00 '")
        public MobileElement activityTime;
        @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH 'התקשר לתמיכה'")
        public MobileElement callPhone;
        @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name  BEGINSWITH '3.0.0.3.creditcards'")
        public MobileElement appVersion;

    }
