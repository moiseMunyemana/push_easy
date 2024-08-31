package pay;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrte_appch {

	public static void main(String[] args) throws IOException {
	

	
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("emp info");
Object empdata [][]= {  {"EmpId", "Name","job"},
                        { 45 , "dave" , "sdet"},
                        { 451 , "dases" , "sdet1"},
                        { 452 , "dapes" , "sdet2"}};
int rows = empdata.length;
System.out.println("number of rows is "+ rows);
int cells = empdata[0].length;
System.out.println("number of cells is " +cells);

/*for (int x =0 ; x<rows ; x++) {
	XSSFRow  row = sheet.createRow(x);
	
	for(int c =0 ; c < cells;c++) {
		
	XSSFCell	cell=row.createCell(c);
	Object value = empdata[x][c];
	if (value instanceof String ) {
		cell.setCellValue((String)value);
	}
	if (value instanceof Integer ) {
		cell.setCellValue((Integer )value);
	}
	if (value instanceof Boolean ) {
		cell.setCellValue((Boolean)value);
	}
	}
}*/
//using for... each loop
 int rowCount =0;
 
 for (Object emp[]: empdata) {
	 XSSFRow row = sheet.createRow(rowCount++);
	 
	 int columnCount = 0;
	 for(Object value: emp) {
		 XSSFCell cell = row.createCell(columnCount++);
		 
		 if (value instanceof String ) {
				cell.setCellValue((String)value);
			}
			if (value instanceof Integer ) {
				cell.setCellValue((Integer )value);
			}
			if (value instanceof Boolean ) {
				cell.setCellValue((Boolean)value);
			}
	 }
 }
	String filepath	 = ("C:\\Users\\User\\coding\\APACHE\\src\\pay_folder\\employee.xlxs");
	FileOutputStream outstream = new FileOutputStream(filepath);
	workbook.write(outstream);
	outstream.close();
	System.out.println("..................Employee filestream written successfully................");
}

}
