package Inheritance;

public class Laptop extends Product {
	double price;
	String proccessor;
	
	public Laptop(String brand,String proccessor,double price) {
		super(brand);
		this.proccessor=proccessor;
		this.price=price;
	}
	
	public void display() {
		System.out.println(brand);
		System.out.println(proccessor);
		System.out.println(price);
	}
}
