import Pages.*;
import Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.*;
import Listeners.TestAllureListener;

import Utils.PropertyManager;
@Listeners({TestAllureListener.class})
public class GetLoanPageTest extends BasePage{
    @Test(priority = 0,description = "לקיחת הלוואה חדשה")
    public void Get_new_loan() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        GetLoanPage getLoanPage=new GetLoanPage(driver);
        loginPage.EnterButton.click();
        Utils.TapCordinate(driver,85,448);
        loginPage.loginsucces(PropertyManager.getInstance().getGetLoanPageTestTestId(),PropertyManager.getInstance().getGetLoanPageTestPass(),PropertyManager.getInstance().getGetLoanPageTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,2);
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickgetLoanButton();
        getLoanPage.loanContinueButton1.click();
        Utils.TapCordinate(driver,117,391);
        getLoanPage.type_Amount("1000");
        getLoanPage.loanNextBoard.click();
        Utils.waitForElement(driver,getLoanPage.loanContinueButton,10);
        getLoanPage.loanContinueButton.click();
        Utils.waitForElement(driver,getLoanPage.loanContinueButton,10);
        getLoanPage.loanContinueButton.click();
        Utils.waitForElement(driver,getLoanPage.confirmation_amount,10);
        getLoanPage.AcceptContinueButton.click();
        getLoanPage.loanScreenCaptureButton.click();
    }
    @Test(priority = 1,description = "לקיחת הלוואה עם סכום שגוי וקבלת הודעה תקינה")
    public void Get_new_loan_invalid_amount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        GetLoanPage getLoanPage=new GetLoanPage(driver);
        loginPage.EnterButton.click();
        Utils.TapCordinate(driver,85,448);
        loginPage.loginsucces(PropertyManager.getInstance().getGetLoanPageTestTestId(),PropertyManager.getInstance().getGetLoanPageTestPass(),PropertyManager.getInstance().getGetLoanPageTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,2);
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickgetLoanButton();
        getLoanPage.loanContinueButton1.click();
        Utils.TapCordinate(driver,117,391);
        getLoanPage.type_Amount("50");
        getLoanPage.loanNextBoard.click();
        String  mishpat = getLoanPage.loanErrorAmountText.getText();
        Assert.assertEquals("סכום ההלוואה המינימלי הינו ₪1,000.00", mishpat);

    }
    @Test(priority = 2,description = "הצגת לוח סילוקן")
    public void DisposalBoard() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        LoansPage loansPage =new LoansPage(driver);
        loginPage.EnterButton.click();
        Utils.TapCordinate(driver,85,448);
        loginPage.loginsucces(PropertyManager.getInstance().getGetLoanPageTestTestId(),PropertyManager.getInstance().getGetLoanPageTestPass(),PropertyManager.getInstance().getGetLoanPageTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,5);
        dashbordPage.clickdashLoanMenu();
        loansPage.clicknameLoan();
        loansPage.clickloanDetailsBoardButton();
        Utils.waitForElement(driver,loansPage.CaptureButton,5);
        loansPage.CaptureButton.click();
    }
    @Test(priority = 3,description = "הצגת פרטי ההלוואה")
    public void  LoanDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        LoansPage loansPage =new LoansPage(driver);
        loginPage.EnterButton.click();
        Utils.TapCordinate(driver,85,448);
        loginPage.loginsucces(PropertyManager.getInstance().getGetLoanPageTestTestId(),PropertyManager.getInstance().getGetLoanPageTestPass(),PropertyManager.getInstance().getGetLoanPageTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,5);
        dashbordPage.clickdashLoanMenu();
        loansPage.clicknameLoan();
        Thread.sleep(2000);

    }
//        @AfterMethod
//        public void teardown () {
//            driver.closeApp();
//        }
    }
