package write_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_xcl {

	public static void main(String[] args) throws IOException { 
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("emp info1");
		
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		empdata.add(new Object[]{"EmpId", "Name","joB"});
		empdata.add(new Object[] {45 , "dave" , "sdet"});
		empdata.add(new Object[] { 451 , "dases" , "sdet1"});
		empdata.add(new Object[] { 452 , "dapes" , "sdet2"});
			
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
			String filepath	 = ("C:\\Users\\User\\coding\\APACHE\\src\\write_demo1\\TEST.xlxs");
			FileOutputStream outstream = new FileOutputStream(filepath);
			workbook.write(outstream);
			outstream.close();
			System.out.println("..................Employee filestream written successfully................");
	}

}
