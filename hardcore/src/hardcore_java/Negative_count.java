package hardcore_java;

public class Negative_count {

	public static void main(String[] args) {
		int arr[] = {3, 2, -1, 9, -8, 6, -2,-15,20,11,-13};
		int count_neg=0;
		
		for (int c=0; c<arr.length; c++) {
			if (arr[c]<0) {
				count_neg+=1;
				
			}
			
		}
		System.out.println("The total count  of negative number is "+ count_neg);

	}

}
