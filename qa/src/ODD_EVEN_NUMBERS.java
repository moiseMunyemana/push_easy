import java.util.Scanner;

public class ODD_EVEN_NUMBERS {

	
	   Scanner scanner = new Scanner(System.in);
       int  limit = scanner.nextInt();
    
       
	public void even(int limit ) {
		System.out.println("*****************EVEN NUMBERS 0-100**********************");
		for (int i = 0 ; i<limit ; i++) {
		if (i % 2 ==0) {
		System.out.println(i);
		}
	}
	 
	}
	public void odd(int limit ) {
			System.out.println("*****************ODD NUMBERS 0-100**********************");
			for (int i = 0 ; i<limit ; i++) {
			if (i % 2 !=0) {
			System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ODD_EVEN_NUMBERS k = new ODD_EVEN_NUMBERS();
		k.even(67);
		k.odd(78);
		}
		}
