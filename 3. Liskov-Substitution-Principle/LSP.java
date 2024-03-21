class Vehicle {
	public void start() {
		System.out.println("Vehicle starting...");
	}
	
	public void stop() {
		System.out.println("Vehicle stopping...");
	}
}

class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car starting...");
	}
	
	@Override
	public void stop() {
		System.out.println("Car stopping...");
	}
}

class Bicycle extends Vehicle {
	@Override
	public void start() {
		System.out.println("Bicycle starting...");
	}
	
	@Override
	public void stop() {
		System.out.println("Bicycle stopping...");
	}
}

// A Subclass can enchance base class functionality but should not can't reduce base class functionality.
// LSP is extension of Open-Close Principle

class LSP {
	public static void main(String[] args) {
		// If super class as a ability to replace a subclass then it satisfies Liskov Principle. or 
		// If super class object can be replaced with subclass means then it satisfies Liskov Principle.
		Vehicle vehicle1 = new Car();
		Vehicle vehicle2 = new Bicycle();
		
		vehicle1.start(); 
		vehicle1.stop(); 
		
		vehicle2.start();
		vehicle2.stop(); 
	}
}