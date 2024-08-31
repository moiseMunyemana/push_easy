package write_demo;

import java.io.FileInputStream;

public class Read_excel {

	public static void main(String[] args) {
		

		String excelpath = "C:\\Users\\User\\coding\\APACHE\\src\\pay_folder\\TESTSUITE.xlsx";
		FileInputStream inputstream = new FileInputStream(excelpath);
		

		int rowsCount=.getRowCount("GMAIL");
		System.out.println(rowsCount);


		for(int i=1;i<=rowsCount;i++) {

		String v1=xls.getCellData("GMAIL", "TCID", i);
		String v2=xls.getCellData("GMAIL", "TESTCASE", i);
		String v3=xls.getCellData("GMAIL", "STATUS", i);

		System.out.println(v1+" | "+v2+" |"+v3);
		}

	}

}
