package parameterization;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
  WebDriver driver;
  @Parameters("browserName")
    @BeforeMethod
    public void preRequisiteForDemo(String browserName){
      if(browserName.equalsIgnoreCase("chrome")){
          System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
           driver = new ChromeDriver();
      }else if(browserName.equalsIgnoreCase("firefox")){

      }else if(browserName.equalsIgnoreCase("edge")){

      }else{
          System.out.println("Please select the correct browser Name");
      }

    }
    @Parameters({"courseName","cityName"})
    @Test
    public void verifySearchCourseOnGoogle(String courseName, String cityName) throws InterruptedException {

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchElement = driver.findElement(By.name("q"));
        searchElement.sendKeys(courseName + cityName);
        searchElement.sendKeys(Keys.ENTER);

        Thread.sleep(4000);

    }
        @AfterMethod
        public void postRequisiteForDemo(){
            driver.close();
        }

}
