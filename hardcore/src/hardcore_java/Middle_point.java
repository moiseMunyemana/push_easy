package hardcore_java;

import java.util.Scanner;

public class Middle_point {

	public static void main(String[] args) {
	
		System.out.println("please key in the first number : ");
		Scanner sc = new Scanner(System.in);
	    int  first_number = sc.nextInt();
	
	    
	    System.out.println("please key in the second number : ");
		Scanner in = new Scanner(System.in);
	    int  second_number = in.nextInt();
	    
	    
	    System.out.println("please key in the third number : ");
		Scanner pi = new Scanner(System.in);
	    int  third_number = pi.nextInt();
	    
	    if (third_number -second_number == first_number) {
	    	System.out.println("THOSE NUMBERS HAVE A MIDDLE POINT");
	    }
	    else {
	    	System.out.println("Dont have a middle number ");
	    }
	}

}
