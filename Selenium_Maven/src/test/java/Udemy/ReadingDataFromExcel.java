package Udemy;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataFromExcel {

    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\rahuls10\\Downloads\\testdata.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet= workbook.getSheet("Sheet1");//Provide Sheet Name
        //XSSFSheet sheet= workbook.getSheetAt(0);//Provide Sheet Index
        int totalRows=sheet.getLastRowNum();//Get Number of Rows
        int totalnoofcells=sheet.getRow(1).getLastCellNum();//Get Number of columns/cells
        System.out.println("Total Number of Rows ="+totalRows);
        System.out.println("Total Number of Cells ="+totalnoofcells);

        for(int r=0;r<=totalRows;r++)
        {
            XSSFRow currentRow=sheet.getRow(r);//Get Entire Row
            for(int c=0;c<totalnoofcells;c++)
            {
                //currentRow.getCell(c).toString();
                XSSFCell cell=currentRow.getCell(c);
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();

    }
}
