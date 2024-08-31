package hardcore_java;

import java.util.Scanner;

public class Fact_3 {

	public static void main(String[] args) {
		
		
		System.out.println("please key in the first number : ");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
		  System.out.print(n + " = ");
		    while (n % 3 == 0){
		        System.out.print("3 * ");
		        n = n / 3;
		    }
		    System.out.print(n);
          
}
}