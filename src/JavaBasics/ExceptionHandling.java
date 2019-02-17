package JavaBasics;

public class ExceptionHandling {

	

	

	public static void main(String[] args) {
		//int i=9/0;
		//System.out.println(i);
		//caught exception
		//Thread.sleep
		//1.try-catch
		
		try {
			int i=9/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("ABC");
			
		

	}

}
