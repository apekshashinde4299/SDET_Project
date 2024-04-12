package priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"}, alwaysRun = true)
    public void verifyFundTransfer() {
        System.out.println("Verify Fund Transfer");
    }

    @Test(enabled = false)
    public void verifyCardManagement() {
        System.out.println("Verify Card Management");
    }

    @Test
    public void verifyCashBankOffer() {
        System.out.println("Verify Cash Bank Offer");
    }
}
