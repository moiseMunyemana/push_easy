package q_BASK;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int EMP_ID [] = new int[10];
		EMP_ID [0]=30;
		EMP_ID [5]=80;
		
		System.out.println(EMP_ID[0]);
		System.out.println("********************************");

		char [] xfv= {'B', 'g' , 'j'};
		System.out.println(xfv[2]);
		System.out.println("********************************");
		double []salary = new double [2];
	salary[0] = 677.99;	
	System.out.println(salary[0]);
	System.out.println("********************************");
	
	String [] cities = new String [4];
		cities[0]=	"kigali ";
	cities[1]=	"bruxelles";
	cities[2]= "montreal";
	cities[3]= "Halfax";
	
	System.out.println(cities[2]);
	System.out.println(cities[2].length());
	System.out.println(cities[2].substring(7));
	System.out.println(cities[1].substring(4));
	System.out.println(cities[2].substring(3,5));
	System.out.println("********************************");
	
	String name = "kruz";
	System.out.println(name.indexOf('a'));
	System.out.println(name.indexOf('e'));
	System.out.println(name.indexOf('i'));
	System.out.println(name.indexOf('u'));
	System.out.println(name.indexOf('o'));	
	System.out.println("********************************");
	
	
	char[] try1 = name.toCharArray();
	 
    for (int i = try1.length - 1; i >= 0; i--)
        System.out.print(try1[i]);
    System.out.println("******************************************");
    
    int [][] e = new int [3][3];
    e[0][0]=6;
    e[0][1]=7;
    e[0][2]=98;
    e[1][0]=9;
    e[1][1]=90;
    e[1][2]=78;
    e[2][0]=45;
    e[2][1]=78;
    e[2][2]=867;
    
    
    //classic for loop
    for(int i =0; i<=2; i++){
    	
    	for (int j=0 ; j <=2 ;j++) {
    		//System.out.println(e[i][j]);
    		System.out.print(e[i][j]+ "  ");
    		
    	}
    	System.out.println();
    }
    System.out.println("********************************");
    // for each loop
    
    for (int i []: e) {
    	for (int j : i) {
    		System.out.print(j + "  ");
    	}
    	System.out.println();
    }
    
    System.out.println("****************************************");
    
    int f [][]= {{50 , 7}, {78,9}, {89, 6} };
    
    for (int i []:f) {
    	for (int j :i) {
    		System.out.print(j + "  ");
    
    	}
    	System.out.println();
    }

    System.out.println("****************************************");
    String B ="MOSES";
    String C  = "moses";
    System.out.println(B.equals(C));
    System.out.println(B.equalsIgnoreCase(C));
    System.out.println(C.contains("e"));
    		
    
    System.out.println("********************??????????????????????????///////////////");
    
    
    int y []= {90,67,56};
    int sum =0;
    
    for (int i : y ) {
    	sum= sum+i;
    	if ( i > 8) {
    		System.out.println(i+"  ");
    	}
    	System.out.println("the total sum is " + sum);
    }
    
    System.out.println("///////////////\\\\\\\\\\\\\\\\\\\\\\\\");
    
    String  h []= {"moses", "khalid", "kim", "khalidashian"};
    for ( String  i :h) {
    	if (i.length()>4) {
    		System.out.print(i+"  ");
    	}
    }
    System.out.println("****************");
    
    Object k[]= new Object [4];
    k [0]=89;
    k [1]= "FART";
    k [2]= "L";
    k[3]= 89.090;
    
    for (Object i :k ) {
    	
    	System.out.println(i);
    }
    
    System.out.println("****************");
    
   Object b[] = {  89, "FART","joe", "L", 89.090 } ;\;]lmnk., 
   
   for (Object i : b ) {
   	
   	System.out.println(i);
   }
   
   System.out.println("****************");
   
  int []arr1 = {29, 25 , 45};
  int min = arr1[0];
  for (int i=1; i<arr1.length; i++) {
	  //System.out.println(i);
	  if (min > arr1[i]) {
		  min=arr1[i];
	  }
	  System.out.println();
  }
  System.out.print(min);
  
  System.out.println("*********sum of integer*******");
  
  int number = 25;
  int sum1 = 0;
  int   digit=0;
  while (number >0) {
	 digit = number%10;
	  sum1 +=  digit;
	  number = number / 10; 
  }
  System.out.println(sum1); 
 
  System.out.println("*******pentagonal numbers*********");
  
  int count = 1;
	for(int i = 1; i <= 50; i++)
	{
		System.out.printf("%-6d",(i * (3 * i - 1))/2);
		if(count % 10 == 0)
		{				
			System.out.println();
		}
		count++;
	}
   
	
	int investment_amount=  1000;
	float  rate = 0.10f;
	int yearz =5;
	double  futureInvestmentValue = investment_amount * Math.pow(1 + rate, yearz * 12);
	int formatter = 0;
	System.out.println("Years    FutureValue");
	int i =1;
	for( i = 1; i <= yearz; i++) {
    	 formatter = 19;
	    if (i >= 10) formatter = 18;
		//System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue);
       }
	
	System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue);
	
	
	int x =9;
	Integer  b1 = x;
	System.out.println(b1.compareTo(78));
	
	
	int r = -167;
	int o= 90;
	int z = 878;
	
	if (r>o && r>z) {
		System.out.println("r is greater");
		
	}
	else if (o>r && o>z) {
		System.out.println("o is greater");
	}
	else {
		System.out.println("c is greater");
	}
		
	 String  []h1 = {"moses", "khalid", "kim", "khalidashian"};
	 //boolean g = Arrays.asList(h1).contains("kim");
	 //System.out.println(g);
	}
	
}