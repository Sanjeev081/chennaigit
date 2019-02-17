package OOP3;

public class Base extends Shape{
	Base(){
		System.out.println("Base class constructor");
	}
	

	public static void main(String[] args) {
	//Shape s=new Base();
		//s.drawing();
		//s.fill();
		Base obj=new Base();
	
	}

	@Override
	void drawing() {
		System.out.println("test drawing");
		
	}

}
