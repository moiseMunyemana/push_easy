package objectoop;

public class B extends A {
		
		 
		 public void divide() {
			  
			System.out.println("dfgh");
		 }
	

	public static void main(String[] args) {

		B l = new B();
		l.f =78;
		l.s=9;
		l.add();
		l.divide();
		
		System.out.println(l.multiply(4,5 ,7 ));
		
	}

}
