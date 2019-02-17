package oopsconceptpart2;

public class Bmw extends car{
	
	@Override
	public void start() {
		 int a = 10;
		 int b =20;
		 int c=30;
		 int d;
		 d = a+b+c;
		 System.out.println("child class " +d);
	}
		public void theftsafety() {
			System.out.println("Bmw----theftsafety");
		}
		public void engine() {
			System.out.println("Bmw----engine");
	
			
		}
		@Override
		public void stop() {
		
		}
		@Override
		public void refuel() {
			
		}
		
}
