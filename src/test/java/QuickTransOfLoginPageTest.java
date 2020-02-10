import Pages.*;
import Utils.Utils;
import Pages.BasePage;
import Pages.DashbordPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import Listeners.TestAllureListener;

@Listeners({TestAllureListener.class})

public class QuickTransOfLoginPageTest extends BasePage {

    @Test(priority = 0,description = "ביצוע העברה מתפריט מהיר")
    public void QuickTransOfLogin () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        TransfersPage transfersPage=new TransfersPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.click_HamburgerButton();
        Utils.scrollToText("יציאה",driver);
        Utils.waitForElement(driver,loginPage.snapshot,10);
        loginPage.clickquicktransfer();
        loginPage.loginsuccesOnlyPass("1q1q1q");
        transfersPage.type_Name("shalom");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        transfersPage.accountnum.sendKeys("532142");
        transfersPage.typeNumAccount("31","109");
        driver.navigate().back();
        transfersPage.clickContinueButton();
        transfersPage.amount.click();
        transfersPage.amount2.sendKeys("20");
        driver.navigate().back();
        transfersPage.clickContinueButton();
//        Thread.sleep(2000);
        if(driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\n")).size()>0){
            transfersPage.clickyesPopUp();
        }
        if(driver.findElements(By.id("com.ideomobile.discount:id/error_positive_button")).size()>0){
            transfersPage.clickyesPopUp();
        }
        Utils.waitForElement(driver,transfersPage.AcceptButton,10);
        transfersPage.clickAcceptButton();
        transfersPage.clickCaptureButton();
    }



}
