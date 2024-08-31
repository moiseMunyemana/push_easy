package test;

public class Mixture {
	
	int a ;
	static int b;
	 static String g = "gangster";
	
	void chiwasa() {
		System.out.println("i m dyamic "+ a);
	}
	
	static void popup() {
		
		System.out.println("i m dyamic "+ b);
	}

	
	void shit() {
		
		popup();
		System.out.println("i m dyamic & i can access  non static parameters and methods");
	}
	public static void main(String[] args) {
		Mixture r = new Mixture();
		r.a = 90 ;
		r.chiwasa();
		dynamic_static.eat();
		b =78;
		popup();
		
		System.out.println(Mixture.g.length());
		r.shit();
		
  
	}

}
