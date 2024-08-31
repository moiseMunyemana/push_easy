package c;

public class Private_Example {

	

	private int age=23;
	private String name="George";


	private void method1() {

		System.out.println("method1");
	}

	public static void main(String[] args) {

		Private_Example p= new Private_Example();

		System.out.println(p.age);
		System.out.println(p.name);
		p.method1();


	}

}
