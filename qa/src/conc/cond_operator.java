package conc;

public class cond_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 15;
	     int y = 5;

	     // Check if both conditions are true
	     if (x < 20 && y > 20) { // true
	         System.out.println("Both conditions are true");
	     } else {
	         System.out.println("One or both conditions are false");
	     }

	     // Check if at least one condition is true
	     if (x < 20 || y < 20) { //true
	         System.out.println("At least one condition is true");
	     } else {
	         System.out.println("Both conditions are false");
	     }

	     // Use of arithmetic operators in conditional statements
	     if ((x + y) > 30) { //true
	         System.out.println("Sum of x and y is greater than 30");
	     } else {
	         System.out.println("Sum of x and y is not greater than 30");
	     }

	     System.out.println("all if condition block executed");
	     System.out.println("program ends here");
	     
	     
	     int key=8;

			for(int k=5;k<10;k++) {

				if(key==k)// 8==5  8==6  8==7 8==8
				break;//exit the loop based on above condition

				System.out.println(k);
			}
	}

}
