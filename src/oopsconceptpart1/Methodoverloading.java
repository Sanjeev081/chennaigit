package oopsconceptpart1;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading obj=new Methodoverloading();
		obj.sum();
		
		obj.sum(10);
		obj.sum(10, 20);
		
		
	}
	public static void main(int p) {
		
	}
	public static void main(int p,int k) {
		
	}
	public void sum() {
		System.out.println("SUM method--zero program");
	}
	public void sum(int i) {
		System.out.println("sum method-- 1 input param");
		System.out.println(i);
		
	}
	public void sum(int i,int j) {
		System.out.println("sum method--2 input param");
		System.out.println(i+j);
	}
	

}
