package assertion;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void verifyRediffMailLoginPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        WebElement userNameTextBox = driver.findElement(By.id("login1"));
        Assert.assertEquals(title,"Rediffmail","Rediffmail Rext Should Be Match");
        Assert.assertTrue(userNameTextBox.isEnabled(),"userNameTextBox should be true");
        driver.close();



    }
}