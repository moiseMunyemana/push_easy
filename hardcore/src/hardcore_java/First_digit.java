package hardcore_java;

import java.util.Scanner;

public class First_digit {
	
		

	public static void main(String[] args) {
	
		System.out.println("please key in the first number : ");
		Scanner sc = new Scanner(System.in);
	    String  input = sc.nextLine();

	    System.out.println(input.charAt(0));
}
}