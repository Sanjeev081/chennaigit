package JavaBasics;

public class constructorconcept {
	//class vars
	String name;
	int age;
	public constructorconcept () {
		System.out.println("Default constructor");
	}
	public constructorconcept(int i) {
		System.out.println("1 param constructor");
		System.out.println(i);
	}
	public constructorconcept(int i,int j) {
		System.out.println("2 params constructor");

	}
	public constructorconcept(String name,	int age) {
		this.name=name;
		this.age=age;
		
		
		
	}
	
		public static void main(String[] args) {
			constructorconcept obj=new constructorconcept();
			constructorconcept obj1=new constructorconcept(10);
			constructorconcept obj2=new constructorconcept(10,20);
		
			
			constructorconcept obj3=new constructorconcept("sanjeev",27);
			System.out.println(obj3.name);
			System.out.println(obj3.age);
			
		
			

		 
		 
	

	}

}
