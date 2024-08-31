package conc;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("what is your role? : ");
		String role = scanner.nextLine().toLowerCase().trim();
		
switch ( role ) { 
case "moderator":
System.out.println("you re a moderator"  );
     break;
case "admin":
	System.out.println("you re a admin " );
	break;
case "tester":
	System.out.println("you re a tester" );
	break;
default:
	System.out.println("you re a guest");
}
	}

}
