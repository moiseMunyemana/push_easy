package inhertance;

public class child extends Parent{
	
public void car() {
		
		System.out.println("car is owned by child");
	}
	


	public static void main(String[] args) {
		child c = new child();
		c.car();
		c.factory();
		c.house();
		System.out.println(c.pension);
		System.out.println(c.grade);
		
	}



}
