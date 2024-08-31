package hardcore_java;

import java.util.Scanner;

public class Consective {

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
	    
	    
	        if (first_number + 1 == second_number && second_number+1 ==third_number) {
	        	System.out.println("You have entered 'THREE consective numbers' ");
	        	
	        }
	        else {
	        	
	        	System.out.println("not consective numbers");
	        }
	          
		
	    }
	    }
