package hardcore_java;

public class NestedForloops {

	public static void main(String[] args) {
	
		int n = 10; 
		
		for (int c =1 ; c <n ; c++ ) {
			for (int a =1 ; a<=c ; a++) {
				
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
