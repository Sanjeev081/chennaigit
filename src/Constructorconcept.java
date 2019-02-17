
public class Constructorconcept {
	//class vars:
	String name;
	int age;
	public Constructorconcept() {//0para
		System.out.println("Default constructor");
	}
	public Constructorconcept(int a) {//1para
		System.out.println("1 para cons");
		System.out.println(a);
	}
	public Constructorconcept(int a,int b) {//2 para
		System.out.println("2 para cons");
		System.out.println(a +" "+b);
	}
	public Constructorconcept(String name,int age) {
		this.name=name;//this.classvar=localar
		this.age=age;
	
		
	}
	

	public static void main(String[] args) {
		Constructorconcept obj=new Constructorconcept();
		Constructorconcept obj1=new Constructorconcept(10);
		Constructorconcept obj2=new Constructorconcept(10,20);
		Constructorconcept obj3=new Constructorconcept("sanjeev",27);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	
		

	}

}
