package Parameterization;

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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dataProviderwithExcel {
    @DataProvider(name = "test-data")//name defined in here as well as Test data provider
    public Object[][] dataProviderFunc() throws IOException {//return type of data provide is 2d array of object
         Object[][] arrObj = getExcelData("C:\\Users\\rahuls10\\OneDrive - AMDOCS\\Backup Folders\\Documents\\DataProvider.xlsx" , "testCase1");
        return arrObj;
    }
    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        String[][] data = null;
        FileInputStream   fileInputStream = new FileInputStream(fileName);//File Access
        XSSFWorkbook    xssfworkbook =new XSSFWorkbook(fileInputStream);//Excel Type
        XSSFSheet sheet =xssfworkbook.getSheet(sheetName);//Sheet Access
        XSSFRow row= sheet.getRow(0);//0th index
        int noOfRows = sheet.getPhysicalNumberOfRows();//No of rows
        int noofcols = row.getLastCellNum();//No of columns
        Cell cell;
        data =new String[noOfRows-1][noofcols];
        for(int i=1;i<noOfRows;i++)
        {
            for (int j=0;j<noofcols;j++){
                row=sheet.getRow(i);
                cell= row.getCell(j);
                data[i-1][j]= cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "test-data")
    public void searchOnlineClasses2(String courseName2,String cityName2) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searxhBox=  driver.findElement(By.name("q"));
        //we never add test data into test script
        searxhBox.sendKeys(courseName2 + " " + cityName2);//Test Data
        searxhBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }

}
