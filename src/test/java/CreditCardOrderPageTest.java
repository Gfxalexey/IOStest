
import Pages.*;
        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.MobileBy;
        import io.appium.java_client.MobileElement;
        import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
        import java.util.List;
        import java.util.Properties;
        import Listeners.TestAllureListener;

@Listeners({TestAllureListener.class})
public class CreditCardOrderPageTest extends BasePage {
//
//    AppiumDriver<MobileElement> driver;
//    public Properties prop;
//    public BasePage basePage;
//
//
//    @BeforeMethod
//    public void setup() throws MalformedURLException {
//        BasePage basePage = new BasePage();
//        driver = basePage.initialize_driver();
//        prop = basePage.initialize_Properties();
//
//    }

    @Test(priority = 1, description = "הזמנת כרטיס אשרי חדש ויזה")
    public void CreditCardOrder() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CreditCardOrder cardOrder = new CreditCardOrder(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickallaction();
        Utils.scrollToText("הזמנת כרטיס אשראי", driver);
        cardOrder.clickvisacardButton();
        cardOrder.clickcontinueButton();
        cardOrder.clickcontinueButton1();
        cardOrder.typecardname("MIHSA");
        driver.navigate().back();
        cardOrder.clickdateButton();
        cardOrder.clickcheckBox();
        cardOrder.clicktoggleButtonNo();
        cardOrder.clickcontinueButton3();
        cardOrder.clickcontinueButton4();
        Utils.waitForElement(driver, cardOrder.captureButton, 10);
        cardOrder.clickcaptureButton();
    }

    @Test(description = "הזמנת כרטיס שם לא תקין")
    public void CreditCardOrderInvalidAmoun() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CreditCardOrder cardOrder = new CreditCardOrder(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("029360872", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if (driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size() > 0) {
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickallaction();
        Utils.scrollToText("הזמנת כרטיס אשראי", driver);
        cardOrder.clickvisacardButton();
        cardOrder.clickcontinueButton();
        cardOrder.clickcontinueButton1();
        cardOrder.typecardname("a");
        driver.navigate().back();
        cardOrder.clickdateButton();
        cardOrder.clickcheckBox();
        cardOrder.clicktoggleButtonNo();
        cardOrder.clickcontinueButton3();
        String massage = cardOrder.errorname.getText();
        Assert.assertEquals("יש להזין שם באותיות באנגלית", massage);

    }

}
//    @AfterMethod
//    public void teardown() {
//        driver.closeApp();
//    }
//}