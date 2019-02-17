package oopsconceptpart1;

public class StaticAndnonstaticconcept {
	String name="Tom";
	static int age=25;
	public static void main(String[] args) {
		//how to call static method and veriable
		//1.direct calling:
		sum();
		//2.calling by class name
		StaticAndnonstaticconcept.sum();
		System.out.println(age);
		System.out.println(StaticAndnonstaticconcept.age);
		//how to call   nonstatic and variables
		StaticAndnonstaticconcept obj=new StaticAndnonstaticconcept();
		obj.sendmail();
		System.out.println(obj.name);
		//can i  access static methods by using object refrence?yes
		obj.sum();
		
	
	}
	public void sendmail() {
		System.out.println("send mail method");
		
	}
	public  static void sum() {
		System.out.println("Sum method");
	}

}
