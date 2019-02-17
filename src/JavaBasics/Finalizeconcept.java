package JavaBasics;

public class Finalizeconcept {
	
	public void finalize() {
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {
		Finalizeconcept f1=new Finalizeconcept();
		Finalizeconcept f2=new Finalizeconcept();
		f1=null;
		f2=null;
		System.gc();
		
		

	}

}
