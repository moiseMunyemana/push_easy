package hardcore_java;

import java.util.Scanner;

public class Ckeck_odd {

	public static void main(String[] args) {
		
System.out.print("please key in the number : ");
Scanner sc = new Scanner(System.in);
	 String  n = sc.nextLine();
	 int count_even =0;
	 int count_odd =0;
	 for (int c =0 ; c <n.length(); c++) {
		 int d = Integer.parseInt(String.valueOf(n.charAt(c)));
		 if (d % 2==0 ) {
			 count_even+=1;
			 
		 }
		 else {
			 count_odd+=1;
		 }
	 }
	 System.out.println("The count of even numbers are  "+ count_even);
	 System.out.println("The count of odd numbers are  "+ count_odd);
	}

}
