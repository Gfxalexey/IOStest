import Pages.*;
import Utils.PropertyManager;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listeners.TestAllureListener;


@Listeners({TestAllureListener.class})

public class ChangeAccountNamePageTest extends BasePage {

    @Test(priority = 1, description ="החלפת כינוי לחשבון")
    public void Change_account_name() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        ChangeAccountNamePage change = new ChangeAccountNamePage(driver);
        loginPage.EnterButton.click();
//        loginPage.click_changeUser();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getChangeAccountNamePageTestPass());
//        loginPage.loginsucces(PropertyManager.getInstance().getChangeAccountNamePageTestId(), PropertyManager.getInstance().getChangeAccountNamePageTestPass(), PropertyManager.getInstance().getChangeAccountNamePageTestPass());
        Utils.waitForbanner(driver, dashbordPage.Banner, 1);
        dashbordPage.click_HamburgerButton();
        change.click_change_name();
        change.type_new_Name("אוטומציה");
        change.click_Ok_Button();
        Assert.assertEquals("אוטומציה",change.new_name.getText());
    }
    }