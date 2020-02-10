import Pages.*;
import Utils.Utils;
import Pages.BasePage;
import Pages.DashbordPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import Listeners.TestAllureListener;

@Listeners({TestAllureListener.class})

public class QuickwithdrawalOfLoginPageTest extends BasePage {



    @Test(description = "משיכת_מזומן_מדף_לוגין")
    public void QuickCash() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CashWithdrawalPage cashWithdrawalPage = new CashWithdrawalPage(driver);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("יציאה",driver);
        loginPage.clickquickwithdrawal();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        Utils.waitForElement(driver,cashWithdrawalPage.ContinueButton,10);
        cashWithdrawalPage.ContinueButton.click();
        cashWithdrawalPage.ContinueButton.click();
        Utils.waitForElement(driver,cashWithdrawalPage.ContinueButton,10);
        cashWithdrawalPage.ContinueButton.click();
        cashWithdrawalPage.ScreenCaptureButton.click();

    }


//    @AfterMethod
//    public void teardown(){
//        driver.closeApp();
//    }
}
