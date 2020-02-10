import Listeners.TestAllureListener;
import Pages.*;
import Utils.PropertyManager;
import Utils.Utils;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestAllureListener.class})
public class ForeignCurrencyConversionsPageTest extends BasePage {
    @Test(priority = 1,description = "המרת מטח משקל לדולר")
    public void Convers_ILS_To_USD() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        AllActionPage all=new AllActionPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        ForeignCurrencyConversionsPage foreign =new ForeignCurrencyConversionsPage(driver);
        loginPage.EnterButton.click();
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getForeignCurrencyConversionsPageTestId(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass());
        loginPage.EnterButton.click();

        dashbordPage.HamburgerButton.click();
        dashbordPage.allaction.click();
//        Utils.scrollToTextIOS("המרת מט/״ח",driver);
        all.click_foreignConversionsButton();
        foreign.click_ILSButton();
        foreign.click_continueButton();
        Utils.waitForElement(driver,foreign.USDButton,1);
        foreign.EURButton.click();
        foreign.click_continueButton2();

        try {
            boolean isElementPresent = foreign.click_one_account.isDisplayed();
            if(isElementPresent) {
                foreign.click_one_account.click();
                foreign.click_continueButton();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        if(driver.findElements(By.id("com.ideomobile.discount:id/fConversionChooseAccountExitBtn")).size()>0){
//            foreign.XXX.click();
//            foreign.bottomConfirmButton.click();
//        }
        foreign.type_amountConverterButton("5");
        foreign.board_continueButton.click();

        Utils.wait_and_click_Element(driver,foreign.OKButton,2);
//        Utils.waitForElement(driver,foreign.continueButton,10);
        foreign.Accept_continueButton.click();
        foreign.ScreenCaptureButton.click();

    }
    @Test(invocationCount = 1,priority = 0,description = "המרת מטח מדולר לשקל")
    public void Convers_USD_To_ILS() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        AllActionPage all=new AllActionPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        ForeignCurrencyConversionsPage foreign =new ForeignCurrencyConversionsPage(driver);
        loginPage.EnterButton.click();
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getForeignCurrencyConversionsPageTestId(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass(), PropertyManager.getInstance().getForeignCurrencyConversionsPageTestPass());
        loginPage.EnterButton.click();

        dashbordPage.HamburgerButton.click();
        dashbordPage.allaction.click();
        all.click_foreignConversionsButton();
        foreign.click_USDButton();
        foreign.click_continueButton();
        foreign.click_one_account.click();
        foreign.click_continueButton();
        Utils.waitForElement(driver,foreign.ILSButton,2);
        foreign.ILSButton.click();
        foreign.click_continueButton2();


        Utils.waitForElement(driver,foreign.amountEditText,1);

        foreign.type_amountConverterButton("5");
        foreign.board_continueButton.click();

        Utils.wait_and_click_Element(driver,foreign.OKButton,2);
//        Utils.waitForElement(driver,foreign.Accept_continueButton,10);
        foreign.Accept_continueButton.click();
        foreign.ScreenCaptureButton.click();

    }
}