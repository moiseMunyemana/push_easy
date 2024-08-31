package hardcore_java;

public class Reverse {

	public static void main(String[] args) {
	
	String str ="welcome";
	
	int n = str.length();
	
	for (int c=n-1 ; c>=0 ; c--) {
		
		char  reverse= str.charAt(c);
		System.out.print(reverse);
	}
	
	}

}
