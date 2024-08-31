package q_BASK;

public class EXCEPTIONS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
		int a = 2;
         int b = 0;
      
         int c = a/b;
         System.out.println ("Result = " + c);
         }
         catch(Exception e) {
        	 System.out.println("error ocured");
        	 e.printStackTrace();
         }
      
         System.out.println("eND OF THE PROGRAM");
         int k=40;
         int m=30;
         int u=k+m;   
         System.out.println("addition of "+k+" and "+m +" is "+u);


         
         
         String[] stud = new String[3];

         try
         {	
   		stud[0]="mark";
   		stud[1]="steve";
   		stud[3]="john";
         }
   		catch(Exception e1)
   		{
   			e1.printStackTrace();
   			System.out.println("cannot store values in array beyond the size");

   		}
   		for(int i=0;i<stud.length;i++) {

   			System.out.println(stud[i]);
   		}

   		
   		try
		{

			int h=10/0;
			System.out.println(h);
		}

		catch(Exception e){

			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		}


	         int o=40;
	         int p=30;
	         int x=o+p;   
	         System.out.println("addition of "+0+" and "+p +" is "+x);

	         System.out.println("eND OF THE PROGRAM");


	}

}
/*
 * Difference between Checked and Unchecked Exceptions 1) Checked Exception The
 * classes that directly inherit the Throwable class except RuntimeException and
 * Error are known as checked exceptions. For example, IOException,
 * SQLException, etc. Checked exceptions are checked at compile-time.
 * 
 * 2) Unchecked Exception The classes that inherit the RuntimeException are
 * known as unchecked exceptions. For example, ArithmeticException,
 * NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked
 * exceptions are not checked at compile-time, but they are checked at runtime.
 * 
 * 3) Error Error is irrecoverable. Some example of errors are OutOfMemoryError,
 * VirtualMachineError, AssertionError etc.
 */