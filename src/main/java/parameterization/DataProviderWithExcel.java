package parameterization;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {
    @DataProvider
    public Object[][] testDataWithDataProvider() throws IOException {
        Object[][] arrObj = getExcelSheetData("/Users/santosh/Downloads/Book2.xlsx","fileName");
        return arrObj;
    }
    public String[][] getExcelSheetData(String filepath, String sheetName ) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filepath);    //fileNameAccess
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);                //Excel file access
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row  = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();
        Cell cell;
        String[][] data= new String[noOfRows-1][noOfCols];

        for(int i =1; i<=noOfRows-1; i++){
            for(int j=0; j<noOfCols; j++){
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j]= cell.getStringCellValue();
            }
        }
      return data;
    }

    @Test(dataProvider ="testDataWithDataProvider")
    public void verifySearchCourseOnGoogle(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/santosh/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchElement = driver.findElement(By.name("q"));
        searchElement.sendKeys(courseName + " " + cityName);
        searchElement.sendKeys(Keys.ENTER);

        Thread.sleep(4000);
        driver.close();

    }
}

