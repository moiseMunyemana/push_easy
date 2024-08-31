package inhertance;

public class grand_child extends child{
	
	public void kurya() {
		System.out.println("kurya cash ntakoreye");
	}

	public static void main(String[] args) {
		grand_child d = new grand_child();
		d.house();
		d.factory();
		d.car();
		d.kurya();

	}

}


