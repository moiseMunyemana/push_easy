package hardcore_java;

public class Sum_array {

	public static void main(String[] args) {
		int[] arr={2,5,6,10,12,9,13,18,20};
		int sum =0;
		for (int c =0 ; c <=arr.length-1; c++) {

			sum+=arr[c];
	}
		
		System.out.println("The sum of all number in the array is "+ sum);
		}

}
