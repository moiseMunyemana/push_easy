package hardcore_java;

public class Counting_odd_even {

	public static void main(String[] args) {
		int[] arr={2,5,6,10,12,9,13,18,20};
		int even =0;
		int odd = 0 ;
		for (int c =0 ; c <=arr.length-1; c++) {
			//System.out.println(arr[c]);
			if (arr[c]%2==0) {
				even +=1;	
			}
			else {
				odd+=1;	
			}
		}
		System.out.println("The total number of even numbers is "+ even);
		System.out.println("The total number of odd numbers is "+ odd);
	}

}
