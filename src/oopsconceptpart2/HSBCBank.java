package oopsconceptpart2;

public  class HSBCBank implements USbank{
	public void credit() {
		System.out.println("hsbc-credit");
	}
	public void debit() {
		System.out.println("hsbc--debit");
	}
	public void transferMoney() {
		System.out.println("hsbc--tranfermoney");
	}
	public void educationloan() {
		System.out.println("hsbc--edu loan");
	}
	public void carloan() {
		System.out.println("hsbc--car loan");
	}
	@Override
	public void devid() {
		// TODO Auto-generated method stub
		
	}
	public void mutualfund() {
		System.out.println("hsbc--mutualfund");
		
	}
	
		
	

}
