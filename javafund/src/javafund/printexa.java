package javafund;

import java.awt.Point;
import java.util.Date;

public class printexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Three...");
		/* ctrl shift backslash , forward slash 
		 * System.out.print("Two..."); System.out.println("One...");
		 */
		int herAge = 65;
		int myAge  = herAge;
		Date now = new Date ();
		System.out.println (now);
		String message = "hello" + " " +"!!" + " \"Moses\"";
		System.out.println(message);
				System.out.println(message.endsWith("Moses"));
				System.out.println(message.startsWith("kk"));
				System.out.println(message.length());
				System.out.println(message.indexOf("o"));
				System.out.println(message.indexOf("j"));
				System.out.println(message.replace("Moses" , "hen"));
		System.out.println("Ready or not, here I come! " );
	    System.out.print(myAge + 6 - 3);
	    
	}

}
