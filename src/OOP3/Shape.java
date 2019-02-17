package OOP3;

public abstract class Shape {
	
	Shape(){
			System.out.println("shape class constr ");
	}
	 
	int color;
	 abstract void drawing();
	 
	 public void fill() {
		 System.out.println("shape--fill");
		 
	 }
}
