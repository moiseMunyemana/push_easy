package qa_oops;

public class Add  implements Interfs{
  
    

	public void  tim(int c , int g) {
		
	System.out.println(c+g);
	}
	
	public static void main(String[] args) {
		Add g = new Add();
		g.tim(6, 90);
		g.kurya();
		g.cook();
		g.job();
	}
	@Override
	public void kurya() {
		System.out.println("kkkk");
	}

	@Override
	public void job() {
		System.out.println("trilogy");
		
	}

	@Override
	public void cook() {
		System.out.println("micopo");
	
	}

}
