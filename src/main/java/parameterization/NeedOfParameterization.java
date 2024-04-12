package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Test
    public void verifySearchCourseOnGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchElement = driver.findElement(By.name("q"));
        searchElement.sendKeys("Selenium"+"Pune");
        searchElement.sendKeys(Keys.ENTER);

        Thread.sleep(4000);
        driver.close();
    }
}
