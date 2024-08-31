package hardcore_java;

public class Factorial {

	public static void main(String[] args) {
	int num = 5;
	int fact =1;
	
	for ( int  c=num; c>1 ; c--) {
		fact = fact*c;

	}
System.out.println("Factorial of " + num + " is: " +fact);
	}

}
