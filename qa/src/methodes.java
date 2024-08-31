import java.util.Scanner;

public class methodes {

			  // Create a checkAge() method with an integer variable called age
	public static void checkAge(int myAge) {
                 //int result =(int)(Math.random()*100);
                 
                 Scanner scanner = new Scanner(System.in);
                 System.out.print("what is your name?:");
                 String name = scanner.nextLine().toUpperCase().trim();
                 System.out.println("your name is " + name);
                  
                 System.out.print("what is your age?:");
                 byte myAge1 = scanner.nextByte();
                 System.out.println("I m " + myAge1 + " old" );
			    // If age is less than 18, print "access denied"
			    if (myAge1 < 18) {
			      System.out.println("Access denied - You are not old enough!");
			      //System.out.println(result);

			    // If age is greater than, or equal to, 18, print "access granted"
			    } else {
			      System.out.println("Access granted - You are old enough!");
			     // System.out.println(result);
			    }

			  }

			  public static void main(String[] args) {
			     checkAge(20); // Call the checkAge method and pass along an age of 20
			  			}

			// Outputs "Access granted - You are old enough!"

//always create a key to access the method 
 
}
