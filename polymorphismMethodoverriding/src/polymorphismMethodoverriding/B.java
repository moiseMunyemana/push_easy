package polymorphismMethodoverriding;

public class B extends A{
	
	//changing the implementation of parent method in child is called method overriding
	
public void house() {
		
		System.out.println("modified by class B");
	}
	
	


	public static void main(String[] args) {
		
		B b = new B();
		b.factory();
		b.house();
		

	}

}