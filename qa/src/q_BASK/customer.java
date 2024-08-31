package q_BASK;

	
	public class customer {
		//global variables
		String name="Henry";
		int age =45;
		char dept='A';

		public  void info() {

			System.out.println("Customer Name "+name);
			System.out.println("Customer age "+age);
			System.out.println("Customer dept "+dept);

		}

		public void infoCust() {
			System.out.println("Customer info "+name+" "+age+" dept");

		}




		public void main(String[] args) {
			customer c = new customer();//creating a object
			c.info();//calling the function
			c.infoCust();
			

		}
		}

