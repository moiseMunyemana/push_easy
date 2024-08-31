package interfaceConcept;

public class hDFC implements CentralBank {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hDFC w = new hDFC();
		w.savings();
		w.loan();
		w.creditcard();
		w.insurance();
		w.kyc();
	}

	@Override
	public void savings() {
		System.out.println("the saving account steals");
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kyc() {
		System.out.println("ssn not provided");
		
	}

}
