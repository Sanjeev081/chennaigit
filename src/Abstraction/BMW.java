package Abstraction;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("bmw--start");
		
	}

	@Override
	public void stop() {
		System.out.println("bmw--stop");
		
		
	}

	@Override
	public void refuel() {
		System.out.println("bmw---refuel");
				
	}
	//non overiden methods:
	public  void theftsafety() {
		System.out.println("bmw---theftsafety");
	}

	
	}
	   
		


