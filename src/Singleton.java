import java.security.PublicKey;


import JavaBasics.stringconcatenation;


public class Singleton {
	private static Singleton Singleton_instance = null;
	//in oop,a singleton class is a class that can have only once object(instance of the class) at  a time.
	//how to design singleton class:
	//1.make constructor as private 
	//2.write a public  static method that has return type of object of this singleton class(lazy initialization)
	//(lazy Initialization)
	//diff bw normal class and singlrton class;
	//for normal class we use constructor whereas for singleton class we use getInstace() for instantiation
	private static Singleton singleton_instance=null;
	public String str;
	private Singleton() {
		str="Hey,i am using singleton class pattern";
		
		
	}
	public  static  Singleton getInstance() {
		if(Singleton_instance==null) {
			Singleton_instance=new  Singleton();
			return Singleton_instance;
			 
		}
		return Singleton_instance;
		
	}
	
	public static void main(String[] args) {
		Singleton x=Singleton.getInstance();	
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		

	}

}
