import Pages.BasePage;
import Utils.Utils;
import org.testng.annotations.Listeners;

import Pages.*;
import org.testng.annotations.*;
import Listeners.TestAllureListener;

import Utils.PropertyManager;
@Listeners({TestAllureListener.class})


public class ChangeAccountTest extends BasePage {


    @Test(priority = 1, description = "החלפת חשבון")
    public void Change_Account_IOS() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        loginPage.EnterButton.click();
        loginPage.click_changeUser();
        loginPage.loginsucces(PropertyManager.getInstance().getChangeAccountTestId(), PropertyManager.getInstance().getChangeAccountTestPass(), PropertyManager.getInstance().getChangeAccountTestPass());
        Utils.wait_and_click_Element(driver,dashbordPage.Banner,2);
        String Numnow = dashbordPage.num_3.getText();
        dashbordPage.HamburgerButton.click();
        dashbordPage.clickchooseAcoountButton();
        Utils.TapCordinate(driver,214,194);
        String Numnow2 = dashbordPage.num_3.getText();
        if (Numnow != Numnow2) {
            System.out.println("חשבון הוחלף הבצלחה");
        } else System.out.println("חשבון לא הוחלף");
    }
}
