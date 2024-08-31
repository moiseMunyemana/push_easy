package conc;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //do/while loop
		 
	
		 
		 int o = 1;
		
		 do
		  {
		   System.out.println(o);
		   o++;
		  }
		 while
			  (o < 6);
		 	 
	//Use a for loop to print "Yes" 5 times:	 

for(int i = 0; i < 5; ++i) 
{
  System.out.println("Yes");
}

String[] cars = {"Volvo", "BMW", "Ford"};
for (String i : cars) 
{
 System.out.println(i);
 
}

//Stop the loop if i is 5.

for (int i = 0; i < 10; i++) {
	  if (i == 5) {
	    
	break
	;
	  }
	  System.out.println(i);
	}

String[] demo = {"flair", "rwandair", "Air-canada","Volvo", "BMW", "Ford"};

for (String i : demo ) {
	if (i == "Volvo"){
			//continue; skip
		break;//stop
}
	 System.out.println(i);
		}

//skip to next item
for (int b = 0; b < 10; b++) {
	  if (b == 4) {
	    
	continue
	;
	  }
	  System.out.println(b);
	}


for (int j =3 ; j<0; j--) {
	System.out.println(j);
}
}
		 }
	






