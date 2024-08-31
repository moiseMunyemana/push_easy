package hardcore_java;

import java.util.Scanner;

public class Pentagone {

		
      public    int Area() {
    	  Scanner in = new Scanner(System.in);
          System.out.print("Input a number of side: ");
          
          int n = in.nextInt();
          
          Scanner scanner  = new Scanner(System.in);
          System.out.print("Input the size of apothem: ");
          int c = in.nextInt();
    	  
    	  int area = c*n;
    	  return area;
        	
        }
	
  	public static void main(String[] args) {
  		Pentagone pent = new Pentagone();
  		System.out.println("The Pentagone area is : "+ pent.Area());
  		
  	}

}
