package qa_t;

public class oobj {
	String  emp_name ;
	double  salary ;
	int dept_no ;
	//constructor same name as the class
	oobj(String name,double sal, int no){
				emp_name=name;
		 salary = sal;
		dept_no =no ;
	  }
			 
	public void display() {
		
		System.out.println(emp_name);
		System.out.println(salary);
		System.out.println(dept_no);
		
		
	}
	public static void main(String[] args) {

		
		
		 System.out.println("************************");

		 oobj emp3 = new oobj("kruz", 89009, 9);
	emp3.display();
		
	
	}

}
