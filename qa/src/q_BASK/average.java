package q_BASK;

public class average {
	
	public void average_three() {
		double num = 25;
		double num2 = 45;
		double num3 =65;
				
	double average_num= (num +num2 +num3)/3;
	System.out.println("The average value is " + average_num);
			}

	public void middle() {
		String  s ="350";
		int n =s.length()/2;
		
		//System.out.println(n);
		
		if (n%2==1) {
			
		System.out.println("The middle character in the string:"+ s.substring(n, n+1));
		}
		
		else {
			
			System.out.println(s.substring(n , n+1));
		}
		
	}
	
	public void vowels(){
	String f = "w3resource";
	int d =0;
	//System.out.println(f.length());
	
	
	for (int i = 0; i < f.length(); i++)
    {
        if (f.charAt(i) == 'a' || f.charAt(i) == 'e' || f.charAt(i) == 'i'
                || f.charAt(i) == 'o' || f.charAt(i) == 'u')
        	  {
        	
        	d++; 
        	  }
       
			  }
	 
	
	System.out.println(d);
	}
	
	public void counting_words(){
		
		String  p = "The quick brown fox jumps over the lazy dog";
		 int countWords = p.split(" ").length;
		    System.out.println(countWords);
		  }
	
	
		
	public static void main(String[] args) {
		 
		average t = new average();
		t.average_three();
		t.middle();
		t.vowels();
		t.counting_words();
		
		

	}

}
