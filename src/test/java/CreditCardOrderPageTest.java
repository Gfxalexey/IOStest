
import Pages.*;
import Utils.PropertyManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
 import Listeners.TestAllureListener;


@Listeners({TestAllureListener.class})
public class CreditCardOrderPageTest extends BasePage {

    @Test(priority = 1, description = "הזמנת כרטיס אשרי חדש ויזה")
    public void CreditCardOrder() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CreditCardOrder cardOrder = new CreditCardOrder(driver);
//        Utils.wait_and_click_Element(driver,loginPage.AllowButton,10);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getCreditCardOrderPageTestId(), PropertyManager.getInstance().getCreditCardOrderPageTestPass(), PropertyManager.getInstance().getCreditCardOrderPageTestPass());
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
        loginPage.loginsucces(PropertyManager.getInstance().getCreditCardOrderPageTestId(), PropertyManager.getInstance().getCreditCardOrderPageTestPass(), PropertyManager.getInstance().getCreditCardOrderPageTestPass());
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