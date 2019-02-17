package oopsconceptpart2;

public class Testbank {

	public static void main(String[] args) {
		System.out.println( USbank.min_bal);
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.carloan();
		hs.mutualfund();
		USbank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();

	}

}
