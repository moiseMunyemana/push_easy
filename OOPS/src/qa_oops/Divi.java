package qa_oops;

public class Divi  extends Mult {
 
	public void div(int a , int b ) {
		
		System.out.println(a+ " divided by"+ b+ " is "+a/b);
		
	}
	public void div (String a , String b) {
		System.out.println(a.concat(b).toUpperCase());
	}
	public static void main(String[] args) {
		Divi k = new Divi();
		k.div(78, 8);
		
		k.mult(5,40);
		k.div("moise ", " munyemana");
	}
	@Override
	public void fun() {
		
		
	}
}
