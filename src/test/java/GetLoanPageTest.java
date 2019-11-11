import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import Listeners.TestAllureListener;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;
import Utils.PropertyManager;
@Listeners({TestAllureListener.class})
public class GetLoanPageTest extends BasePage{
    @Test(priority = 0,description = "לקיחת הלוואה חדשה")
    public void Get_new_loan() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        GetLoanPage getLoanPage=new GetLoanPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces(PropertyManager.getInstance().getGetLoanPageTestTestId(),PropertyManager.getInstance().getGetLoanPageTestPass(),PropertyManager.getInstance().getGetLoanPageTestPass());
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickgetLoanButton();
        getLoanPage.loanContinueButton1.click();
        getLoanPage.type_Amount("1000");
        getLoanPage.loanNextBoard.click();
        getLoanPage.loanContinueButton.click();
        Utils.waitForElement(driver,getLoanPage.loanContinueButton,10);
        getLoanPage.loanContinueButton.click();
        Utils.waitForElement(driver,getLoanPage.confirmation_amount,10);
        getLoanPage.loanContinueButton.click();
        getLoanPage.loanScreenCaptureButton.click();
    }
    @Test(priority = 1,description = "לקיחת הלוואה עם סכום שגוי וקבלת הודעה תקינה")
    public void Get_new_loan_invalid_amount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        GetLoanPage getLoanPage = new GetLoanPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);

        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683","1q1q1q","1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickgetLoanButton();
        getLoanPage.loanContinueButton1.click();
        getLoanPage.type_Amount("100");
        getLoanPage.loanNextBoard.click();
        String  mishpat = getLoanPage.loanErrorAmountText.getText();
        Assert.assertEquals("סכום ההלוואה המינימלי הינו 1,000.00 ש\"ח", mishpat);

    }
    @Test(priority = 2,description = "הצגת לוח סחלוקן")
    public void DisposalBoard() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        LoansPage loansPage =new LoansPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.clickdashLoanMenu();
        dashbordPage.clickdashLoanMenu();
        loansPage.clicknameLoan();
        Utils.scrollScreen(driver);
        loansPage.clickloanDetailsBoardButton();
        Thread.sleep(2000);

    }
    @Test(priority = 3,description = "הצגת פרטי ההלוואה")
    public void  LoanDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        LoansPage loansPage = new LoansPage(driver);
        Utils.wait_and_click_Element(driver,loginPage.AllowButton,3);
        loginPage.EnterButton.click();
        Thread.sleep(1000);
        loginPage.loginsucces("320555683", "1q1q1q", "1q1q1q");
        dashbordPage.TutorialSkip.click();
        if(driver.findElements(By.id("com.ideomobile.discount:id/bannerImageImageView\n")).size()>0){
            driver.navigate().back();
        }
        dashbordPage.clickdashLoanMenu();
        dashbordPage.clickdashLoanMenu();
        loansPage.clicknameLoan();
        Thread.sleep(2000);

    }
//        @AfterMethod
//        public void teardown () {
//            driver.closeApp();
//        }
    }
