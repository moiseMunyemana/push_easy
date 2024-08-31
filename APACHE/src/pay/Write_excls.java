package pay;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Write_excls {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet s1 = wb.createSheet("Sheet 1");
		XSSFSheet s2 = wb.createSheet("Sheet 2");
		XSSFSheet s3 = wb.createSheet("Sheet 3");

		XSSFRow r1 = s1.createRow(0);
		XSSFRow r2 = s1.createRow(1);
		XSSFRow r3 = s1.createRow(2);

		XSSFCell c1 = r1.createCell(0);
		XSSFCell c2 = r1.createCell(1);
		XSSFCell c3 = r1.createCell(2);
		XSSFCell c4 = r1.createCell(3);
		XSSFCell c5 = r1.createCell(4);

		c1.setCellValue(12345);
		c2.setCellValue(12.36);
		c3.setCellValue("Test");
		c4.setCellValue("Sample");


		try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\User\\coding\\APACHE\\src\\pay_folder\\excel.xlsx")) {
		    wb.write(fileOut);
		   
		}
System.out.println("*******************excel file has been written.........................");
	}

}
