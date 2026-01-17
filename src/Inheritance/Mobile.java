package Inheritance;

public class Mobile extends Product {
	double price;
	String sim;
	
	public Mobile(String brand,String sim,double price) {
		super(brand);
		this.sim=sim;
		this.price=price;
		
	}
	
	public void display() {
		System.out.println(brand);
		System.out.println(sim);
		System.out.println(price);
	}
}
