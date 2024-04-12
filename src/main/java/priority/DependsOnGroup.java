package priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})
    public void verifyLogin() {
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransfer() {
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyCardManagement() {
        System.out.println("Verify Card Management");
    }

    @Test
    public void verifyCashBankOffer() {
        System.out.println("Verify Cash Bank Offer");
    }
}
