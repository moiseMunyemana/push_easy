package hardcore_java;

import java.util.Scanner;

public class PASSWORD {

	

	public static void main(String[] args) {
		int x = 8;
		System.out.println("please enter your password");
		Scanner scanner = new Scanner(System.in);
		String  pwd_in = scanner.nextLine().toLowerCase();
		int lenght = pwd_in.length();
		//System.out.println(pwd_in);
		
	String pattern = "(\\w)+(\\d){2}";
	if (pwd_in.matches(pattern)&& lenght ==x) {
		System.out.println("valid");
		
	}
	else {
		System.out.println("invalid");
	}
	}

}
