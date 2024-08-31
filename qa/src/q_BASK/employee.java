package q_BASK;

public class employee {
	
	String name ="cruz";
	int age = 89;

	public void add(int e , int v){
		int c = e +v;
		System.out.println("The sum of "+ e +" and "+ v +" is equal to " + c + " done by " + name );
	}
	
	public static void main(String[] args) {
		
		employee emp =new employee();
		System.out.println(emp.name + " is "+ emp.age +" age");
      
		emp.add(8 , 7);
		
		customer j = new customer();
		j.infoCust();
		j.info();
	}

}
