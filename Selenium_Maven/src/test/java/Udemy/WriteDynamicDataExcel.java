package Udemy;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDynamicDataExcel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file =new FileOutputStream("C:\\Users\\rahuls10\\Downloads\\myFile.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();//Create WorkBook
        XSSFSheet sheet= workbook.createSheet("DynamicData");//Create Sheet
        XSSFRow row1= sheet.createRow(0);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int noofrows= sc.nextInt();

        System.out.println("Enter No of Cells");
        int noofcells= sc.nextInt();

        for(int r=0;r<=noofrows;r++)
        {
            XSSFRow currentRow= sheet.createRow(r);
            for(int c=0;c<noofcells;c++)
            {
                XSSFCell cell=currentRow.createCell(c);
                cell.setCellValue(sc.next());

            }
        }



        workbook.write(file);//Attach workbook to file
        workbook.close();
        file.close();
        System.out.println("File Created");
    }
}
