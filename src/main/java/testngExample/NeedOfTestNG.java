package testngExample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfTestNG {
    @Test
    public void DemoOfTestNG1() {
        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void DemoOfTestNG2() {
        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://maven.com/");
        driver.manage().window().maximize();
        driver.close();

    }

    @Test
    public void DemoOfTestNG3() {
        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
        driver.close();

    }
}