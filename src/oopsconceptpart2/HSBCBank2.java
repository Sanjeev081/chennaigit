package oopsconceptpart2;

public  class HSBCBank2 implements USbank,BrazilBank{
	public void credit() {
		System.out.println("hsbc-credit");
	}
	public void debit() {
		System.out.println("hsbc--debit");
	}
	public void transferMoney() {
		System.out.println("hsbc---transferfmoney");
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
		System.out.println("hsbc--mutual fund");
	}
	
		
	

}
