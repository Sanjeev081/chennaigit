package oopsconceptpart1;

public class Localvsglobalvariables {
	//globalvariable
	String name="Tom";
	int age=25;
	
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		Localvsglobalvariables obj=new Localvsglobalvariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
		

	
		
	}
	public void sum() {
		int i=10;
		int j=20;
		int age=25;
	}

}
