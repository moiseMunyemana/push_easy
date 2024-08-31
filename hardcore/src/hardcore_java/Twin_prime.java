package hardcore_java;

public class Twin_prime {

	public static void main(String[] args) {
	 int num =100;
	 for (int i = 2; i < num; i++) {

         if (is_Prime(i) && is_Prime(i + 2)) {
             System.out.printf("(%d, %d)\n", i, i + 2);
         }
     }
 }

 public static boolean is_Prime(long n) {

     if (n < 2) return false;

     for (int i = 2; i <= n / 2; i++) {

         if (n % i == 0) return false;
     }
     return true;

	}

}
