package interfaceConcept;

public class citi_bank implements CentralBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		citi_bank h= new citi_bank();
		h.insurance();
		h.kyc();
		h.creditcard();
		h.loan();
		h.savings();
	}

	@Override
	public void savings() {
		System.out.println("save @ save ");
		
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
		// TODO Auto-generated method stub
		
	}

}
