package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifyRediffMailLoginPage() {
        SoftAssert softAssert = new SoftAssert();

        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        WebElement userNameTextBox = driver.findElement(By.id("login1"));
        softAssert.assertEquals(title,"Rediffmail","Rediffmail Rext Should Be Match");
        softAssert.assertTrue(userNameTextBox.isEnabled(),"userNameTextBox should be true");
        softAssert.assertAll();
        driver.close();



    }
}
