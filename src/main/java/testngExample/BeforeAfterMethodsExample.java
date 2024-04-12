package testngExample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodsExample {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMe() {
        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void DemoOfTestNG1() {
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
    }

    @Test
    public void DemoOfTestNG2() {
        driver.get("https://maven.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMe() {
        driver.close();
    }


}
