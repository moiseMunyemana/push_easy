package conc;

public class oobj{
		  int x;  // Create a class attribute x

		  // Create a class constructor for the MyClass class
		   oobj() {
		    x = 5;  // Set the initial value for the class attribute x to 5
		  }

		  public static void main(String[] args) {
		    // Create an myObj object of class MyClass (This will call the constructor)
		    oobj myObj= new oobj(); 
		    // Print the value of x
		    System.out.println(myObj.x);
		    

		  }
}

