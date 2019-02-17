package JavaBasics;

public class constructorwiththiskeyword {
	String name;
	int age;
	public  constructorwiththiskeyword (String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		
	}
		
	
	
	
	
	

	public static void main(String[] args) {
		 constructorwiththiskeyword  obj=new  constructorwiththiskeyword ("sanjeev",27);
	}

}
