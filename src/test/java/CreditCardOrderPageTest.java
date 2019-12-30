
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
    AllActionPage all=new AllActionPage(driver);
    loginPage.EnterButton.click();
    loginPage.click_changeUser();
    loginPage.loginsucces(PropertyManager.getInstance().getCreditCardOrderPageTestId(), PropertyManager.getInstance().getCreditCardOrderPageTestPass(), PropertyManager.getInstance().getCreditCardOrderPageTestPass());
    loginPage.EnterButton.click();
    dashbordPage.HamburgerButton.click();
    dashbordPage.clickallaction();
    Utils.scrollToTextIOS("הזמנת כרטיס אשראי", driver);
    all.click_credit_card_order();
    cardOrder.click_visacard_Button();
    cardOrder.click_continue_Button();
    cardOrder.click_continue_Button();
    cardOrder.click_dateButton();
    cardOrder.click_checkBox();
    cardOrder.click_toggleButtonNo();
    cardOrder.type_cardname("MISHA");
    cardOrder.board_continue.click();
    Utils.waitForElement(driver,cardOrder.continueButton,1);
    cardOrder.click_continue_Button();
   cardOrder.click_captureButton();
   }

    @Test(description = "הזמנת כרטיס שם לא תקין")
    public void CreditCardOrderInvalidAmoun() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        CreditCardOrder cardOrder = new CreditCardOrder(driver);
        AllActionPage all=new AllActionPage(driver);
        loginPage.EnterButton.click();
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getCreditCardOrderPageTestId(), PropertyManager.getInstance().getCreditCardOrderPageTestPass(), PropertyManager.getInstance().getCreditCardOrderPageTestPass());
        loginPage.EnterButton.click();
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickallaction();
        Utils.scrollToTextIOS("הזמנת כרטיס אשראי", driver);
        all.click_credit_card_order();
        cardOrder.click_visacard_Button();
        cardOrder.click_continue_Button();
        cardOrder.click_continue_Button();
        cardOrder.click_dateButton();
        cardOrder.click_checkBox();
        cardOrder.click_toggleButtonNo();
        cardOrder.type_cardname("a");
        cardOrder.board_continue.click();
        String massage = cardOrder.errorname.getText();
        Assert.assertEquals("יש להזין שם באותיות באנגלית", massage);
    }
}