
public class Functionsinjava {

	public static void main(String[] args) {
		Functionsinjava obj=new Functionsinjava();
		obj.test();
		int d=obj.sum();
		System.out.println(d);
		String t=obj.pqr();
		System.out.println(t);
		int z1=obj.div(10, 5);
		System.out.println(z1);
		String h1=obj.sendmail(10, "sanjeev");
		System.out.println(h1);
		
	}
	//1.no input on output:
	public  void  test() {
		System.out.println("test method");
		 
	}
	//2.no input someoutput
	public int sum() {
		System.out.println("sum method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public String pqr() {
		System.out.print("pqr method");
		String s="selenium";
		return s;
	}
	//3.some input and some output
	public int div(int x,int y) {
		System.out.println("div method");
		int z=x/y;
		return z;
		
	}
	public String sendmail(int p,String q) {
		System.out.println("sendmail");
		String h=q+p;
		return h;
		
	}
}
