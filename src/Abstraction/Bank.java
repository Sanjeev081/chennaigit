package Abstraction;

public  abstract class Bank {
	int amt =100;
	final int rate=10;
	static int loanRate=5;
	//partial abstraction
	//hiding the implementation logic--is called abstraction
	//abstract method---no method body
	//absrarct  class can haved abs method and non abs method
	//can not create object of abstract class
	
	
	public abstract void loan(); //abstract method--no method body
	
	
	
	
	
	public void  credit() {
		System.out.println("Bank--credit");
		
	}
	public void debit() {
		System.out.println("Bank--debit	");
	}
		
	
	

}
