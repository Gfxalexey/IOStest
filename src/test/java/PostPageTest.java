import Pages.*;
import Utils.PropertyManager;
import Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostPageTest extends BasePage {
    @Test(description = "דואר דיסקונט")
    public void Post_Test() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashbordPage dashbordPage = new DashbordPage(driver);
        PostPage post =new PostPage(driver);
        loginPage.EnterButton.click();
        loginPage.loginsuccesOnlyPass(PropertyManager.getInstance().getCancelCyclicTransferPageTestPass());
        loginPage.EnterButton.click();
        Utils.wait_and_click_Element(driver, dashbordPage.Banner, 1);
        dashbordPage.PostButton.click();
        Assert.assertEquals("כל ההודעות",post.AllMassageButton.getText());
        Assert.assertEquals("הודעות דיסקונט",post.TitelText.getText());
        Assert.assertEquals("כל ההודעות",post.AllMassageButton.getText());

    }
}