package hardcore_java;

public class WHILE_LOOPS {

	public static void main(String[] args) {
		
		//increment
		int c =0;
		while(c<10) {
			System.out.print(" ");
			System.out.print(c);
			c++;
		}
		//Decrement
		System.out.print("  ////  ");
		
		int x =7;
		
		while (x>=1) {
			System.out.print(" ");
			System.out.print(x);
			x--;
			
		}

		
		//do while
		int f =1 ;
		do {
			System.out.print(f);
			f++;
		}while(f<=10);
		
	
	System.out.println("  ||     ");
	
	int d =10;
	do {
		System.out.println("  ");
		System.out.println(d);
		d--;
		
	}while(d<=1);
}
}