package hardcore_java;

public  class Matrix {


	public static void main(String[] args)
    {
		int n = 3;
        Matrixed(n);
    }
 
 public static void Matrixed(int n) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
 }}