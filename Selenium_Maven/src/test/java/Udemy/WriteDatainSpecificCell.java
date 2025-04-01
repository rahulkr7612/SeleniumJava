package Udemy;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDatainSpecificCell {

    public static void main(String[] args) throws IOException {

        FileOutputStream file =new FileOutputStream("C:\\Users\\rahuls10\\Downloads\\myFileRandom.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();//Create WorkBook
        XSSFSheet sheet= workbook.createSheet("Random");//Create Sheet
        XSSFRow row1= sheet.createRow(3);
        XSSFCell cell1= row1.createCell(4);
        cell1.setCellValue("sdsd");

        workbook.write(file);//Attach workbook to file
        workbook.close();
        file.close();
        System.out.println("File Created");
    }
}
