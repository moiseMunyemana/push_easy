package hardcore_java;

import java.util.Scanner;

public class String_ckeck {

	public static void main(String[] args) {
		
		System.out.print("please key in the string  : ");
	   Scanner in = new Scanner(System.in);
		
		String str = in.nextLine().toLowerCase();
		
		int count = str.length();
		int counted = 0;
		String vowels  ="u , i ,o,a ,e";
		int count1 = vowels.length();
		for (int i=0 ; i<count ; i++ ) {
			char vow =str.charAt(i);
			 
		for (int c =0;c<count1; c++) {
		
		char vow2= vowels.charAt(c);
		
		if ( vow == vow2){
			counted +=1; 
		}
		
		}
		}	
			
			System.out.println("contains "+ counted +" vowels");
			
		if  (counted==0){
			
				System.out.println("vowels not found");
			
			
		}
	 }


}
