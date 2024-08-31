package pay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sauce_login {

	public static void main(String[] args) throws IOException {
		
		String excelpath = "C:\\Users\\User\\coding\\APACHE\\src\\pay_folder\\SAUCE_LOGIN.xlsx";
		FileInputStream inputstream = new FileInputStream(excelpath);
		//Create Workbook instance holding reference to .xlsx file
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		//Get first/desired sheet from the workbook
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		//Iterate through each rows one by one
		//using for loop
		int rows=sheet.getLastRowNum();
		int cols =sheet.getRow(1).getLastCellNum();
		
		for (int x =0 ; x<=rows;x++) {
			XSSFRow row=sheet.getRow(x);
			for(int c =0; c<cols; c++ ){
				XSSFCell cell=row.getCell(c);
				String  user = cell.getRawValue();
				switch(cell.getCellType()) {
				case STRING :System.out.println(cell.getStringCellValue());break;
				case NUMERIC :System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN : System.out.println(cell.getBooleanCellValue());break;
				
				}
			
			}
			
			System.out.print("|");
		}
		  System.out.println("............file read**************************");
		
		//using iterator
		
		/*Iterator iterator = sheet.iterator() ;
		while(iterator.hasNext()) {
		XSSFRow	row =(XSSFRow) iterator.next();
		
		Iterator cellIterator = row.cellIterator();
		
		while(iterator.hasNext()) {
			XSSFCell cell = (XSSFCell) iterator.next();
			
			switch(cell.getCellType()) {
			case STRING :System.out.println(cell.getStringCellValue());  break;
			case NUMERIC: System.out.println(cell.getNumericCellValue());break;
			case BOOLEAN : System.out.println(cell.getBooleanCellValue());break;
			
			
			}
			System.out.print("  |   ");
		}
		System.out.println();
		}*/
	}

}
