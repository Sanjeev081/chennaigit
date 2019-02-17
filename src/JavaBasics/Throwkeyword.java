package JavaBasics;

public class Throwkeyword {

	

	public static void main(String[] args) {
		
		
		System.out.println("ABC");
		try {
		     throw new  Exception("sanjeev Exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("pqr");
		String Exec_Flag="  ";
		if(Exec_Flag.equals("  ")) {
			try {
			throw new Exception("Exec fla is blank exception");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Test");

	}

}
