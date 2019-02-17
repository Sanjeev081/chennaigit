package OOP2;

public class ICICIBank extends Finance implements USBank,RBI{

	@Override
	public void educationLoan() {
		System.out.println("icici---educationloan");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("icici--homeloan");
		
	}

	@Override
	public void carLoan() {
		System.out.println("icici--carloan");
		
	}

	@Override
	public void debit() {
		System.out.println("icici--debit");
		
	}

	@Override
	public void credit() {
		System.out.println("icici--credit");
		
	}

	@Override
	public void trading() {
		System.out.println("icici--trading");
		
	}
	public void mutualfund() {
		System.out.println("icici--mutualfund");
	}
	public void insurance() {
		System.out.println("icici--insurance");
	}

	

	
	}
	
	


