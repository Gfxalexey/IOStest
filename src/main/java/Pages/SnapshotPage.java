package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class SnapshotPage {
    public SnapshotPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(10)), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]/**/XCUIElementTypeButton[1]")
    public MobileElement snap_Balance;
}
