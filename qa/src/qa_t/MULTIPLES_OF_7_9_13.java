package qa_t;

public class MULTIPLES_OF_7_9_13 {

	public static void main(String[] args) {
		
		int num = 100;
		System.out.println("*****************MULTIPLES OF 7 NUMBERS 0-100**********************");
		
		for (int i = 1 ; i<num ; i++) {
			if (i % 7 ==0) {
				System.out.println(i);
			}
		}
		
	
		System.out.println("*****************MULTIPLES OF 9 NUMBERS 0-100**********************");
		
		for (int i = 1 ; i<num ; i++) {
			if (i % 9 ==0) {
				System.out.println(i);
			}
		}
		System.out.println("*****************MULTIPLES OF 13 NUMBERS 0-100**********************");
		
		for (int i = 1 ; i<num ; i++) {
			if (i % 13 ==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("*****************END***********************************************");
	}

}
