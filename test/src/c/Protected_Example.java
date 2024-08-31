package c;

public class Protected_Example {

	protected int age=23;
	protected String name="Andrew";

	protected void method1() {

		System.out.println("method 1 protected");
	}



	public static void main(String[] args) {

		Protected_Example pr= new Protected_Example();
		System.out.println(pr.age);
		System.out.println(pr.name);
		pr.method1();

	}

}
