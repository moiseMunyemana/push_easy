package inhertance;

public class Parent {

	double pension=434.66;
	char grade='A';
	
	
public void house() {
	
	System.out.println("calling house in parent");
}

public void factory() {
	
	System.out.println("calling factory in parent");
}
	

	public static void main(String[] args) {
		
 Parent p = new Parent();
 p.house();
 p.factory();

		

	}

}