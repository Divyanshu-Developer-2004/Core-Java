package Abstraction;

public interface Vehicle {
	
	void price();
	
	void type(); 
}

class Car implements Vehicle {
	
	public void price() {
		System.out.println("200000");
	}
	
	public void type() {
		System.out.println("Petrol");
	}
}

class Bike implements Vehicle {
	
	public void price() {
		System.out.println("3000000");
	}
	
	public void type() {
		System.out.println("Electric");
	}
}