package q_BASK;

public class exercixe8 {
	
	

	public static void main(String[] args) {
		
		int investment_amount=  1000;
		float  rate = 0.10f;
		int yearz =5;
		//double futureInvestmentValue = investment_amount * Math.pow(1 + rate, yearz * 12);	
		System.out.println("Years    FutureValue");
		for(int i = 1; i <= yearz; i++) {
	    	int formatter = 19;
		    if (i >= 10) formatter = 18;
			System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment_amount, rate/12, i));
	       }
		 }
	 
	 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
			return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		
	}

}
