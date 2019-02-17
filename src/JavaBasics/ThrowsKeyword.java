package JavaBasics;

public class ThrowsKeyword {
	
	public static void main(String[] args)throws ArithmeticException {
		 ThrowsKeyword  obj=new  ThrowsKeyword();
		 obj.sum();
		 System.out.println("ABC");
		
		
	}
	public void sum() throws ArithmeticException{
		try {
			div();
		}catch(Exception e) {
			
		}
		
		
	}
	public void div() throws ArithmeticException{
		int i=9/0;//exception line
	}

}
