package objectoop;
//FIRST METHOD NON RETURNING VALUE
public class OOBJ {

	
	
	public void student (int marks) {
		if (marks >500) {
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  OOBJ k = new OOBJ();
   k.student(678);
   k.student(76);
	}

}
