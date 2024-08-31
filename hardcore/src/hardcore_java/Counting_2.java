package hardcore_java;

import java.util.Scanner;

public class Counting_2 {

	public static void main(String[] args) {
		System.out.println("please key in the number : ");
		Scanner sc = new Scanner(System.in);
	    String  input = sc.nextLine();
         int count =0;
	    for (int c =0 ; c<input.length();c++) {
	    	char  b = input.charAt(c);
	    	int d =Integer.parseInt( String.valueOf(b));
	    	if (d==2) {
	    		count =count +1;
	    	}
	    }
	    System.out.println("The input number is " + input);
	    System.out.println("count of 2 numbers are " + count );
	}

}
