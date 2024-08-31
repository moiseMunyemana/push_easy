package polymorphism;

public class MethodOverloading {
	
	//same method name but different argument/parameters
	
		public void add() {
			
			System.out.println("addition method without input");
		}
		
		public void add(int a) {
			System.out.println("addition with one input");	
		}
		public void add(int a, double b) {
			
			System.out.println("addition with one int and one double");
		}
		public void add(String a) {
		System.out.println("addition with one string input");
		}
		public void add(String a,int b) {
		System.out.println("addition with one string input and int input");
		}
		public void add(double a) {
		System.out.println("addition with one double input");
		}
		public void add(char a, char b) {
		System.out.println("addition with two char input");
		}
		
		
		
		public static void main(String[] args) {
			
	 MethodOverloading m= new MethodOverloading();
	 m.add(30);
	 m.add(23.6);
	 m.add('L', 'P');
	 m.add("john");
	 m.add(66, 10.23);
	 m.add("henry", 10);

		}

	}
