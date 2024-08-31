package package1;

public class P1 {

	String DefaultMessage="This defaults brother";
	public String publicMessage="This PUBLIC  brother";
	protected  String protectedMessage ="This PROTECTED MSG  brother";
	private  String privateMessage ="This PRIVATE MSG  brother";
	
	
	public static void main(String[] args) {
		
		P1 H = new P1();
		System.out.println(H.privateMessage);
	}
	
}


 