package qa_oops;

public class Square_root extends Divi {
 public void square(int a ) {
	 
	 
	 System.out.println( Math.pow(a, 2));
 }
 
 public void div(int a ) {
	 System.out.println("your lucky number is "+ Math.round(a* (Math.random()*100)));
 }
 public void div() {
	 System.out.println("software tester ");
 }
 public static void main(String[] args) {
	 Square_root l= new Square_root();
	 l.div(4);
	 l.square(6);
	 l.div();
 }
}
