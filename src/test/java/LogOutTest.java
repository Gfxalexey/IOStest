import Pages.*;
import Utils.Utils;
import Pages.BasePage;
        import Pages.DashbordPage;
        import Pages.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import Listeners.TestAllureListener;
        import Utils.PropertyManager;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;

@Listeners({TestAllureListener.class})

public class LogOutTest extends BasePage  {
    private static boolean isElementPresent;

    @Test(description = "יצאה מהחשבון")

    public void Loguot_Test() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CashWithdrawalPage cash = new CashWithdrawalPage(driver);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        dashbordPage.click_HamburgerButton();
        dashbordPage.cashWithdrawalButton.click();


        do {
            if(Utils.waitForElement(driver, cash.element450, 0) == true){

            }else Utils.DragElement(cash.amount_carusel3,cash.amount_carusel1,driver,3);
        }while (Utils.waitForElement(driver, cash.element450, 0) == false);


//        Utils.DragElement(cash.amount_carusel3,cash.amount_carusel1,driver,3);
//        boolean isElementPresent = false;
//
//        do {
//            if (cash.element450.isDisplayed() =
//            }= null){
//                isElementPresent=true;
//            Utils.DragElement(cash.amount_carusel3,cash.amount_carusel1,driver,3);
//        }while (isElementPresent=false);





//        Utils.swipe_To_Element_IOS(cash.element450,103,352,362,370,2,driver);

//        List<MobileElement> els2 = (List<MobileElement>) ((IOSDriver) driver).findElementsByIosClassChain("**/XCUIElementTypeWindow[1]/**/XCUIElementTypeButton[9]");
//        System.out.println(els2.get(0).getText());
//        els2.get(0).click();

//        System.out.println(dashbordPage.balanceOfAccount.getText());
//        dashbordPage.click_HamburgerButton();
//        Utils.scrollToTextIOS("יציאה",driver);
//        dashbordPage.exitButton.click();

    }
    @Test(description = " מהחשבון")
    @Ignore
    public void snap() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        SnapshotPage snap=new SnapshotPage(driver);
        Utils.DragElement_point_to_point(186,743,267,181,5,driver);
        Thread.sleep(3000);
        System.out.println(snap.snap_Balance.getText());

    }
}
