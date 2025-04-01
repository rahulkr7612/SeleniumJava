package Udemy;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDatainExcel {

    public static void main(String[] args) throws IOException {

        FileOutputStream file =new FileOutputStream("C:\\Users\\rahuls10\\Downloads\\WriteData.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();//Create WorkBook
        XSSFSheet sheet= workbook.createSheet("Data");//Create Sheet
        XSSFRow row1= sheet.createRow(0);
        row1.createCell(0).setCellValue("Welcome");//Create cell and write value
        row1.createCell(1).setCellValue("Rahul");
        row1.createCell(2).setCellValue(2345);

        XSSFRow row2= sheet.createRow(1);
        row2.createCell(0).setCellValue("Python");//Create cell and write value
        row2.createCell(1).setCellValue("Automation");
        row2.createCell(2).setCellValue(19);

        XSSFRow row3= sheet.createRow(2);
        row3.createCell(0).setCellValue("Java");//Create cell and write value
        row3.createCell(1).setCellValue("Automation");
        row3.createCell(2).setCellValue(45);

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File Created");
    }
}
