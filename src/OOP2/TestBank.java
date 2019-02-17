package OOP2;

public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank ic=new ICICIBank();
		ic.educationLoan();
		ic.homeLoan();
		ic.carLoan();
		
		ic.credit();
		ic.debit();
		ic.transferMoney();
		ic.trading();
		ic.mutualfund();
		ic.insurance();
		
		System.out.println(USBank.min_bal);
		USBank us=new ICICIBank();
		us.credit();
		us.debit();
		us.transferMoney();
		

	}

}
