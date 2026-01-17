package Inheritance;

public class Assign_35_Bike extends Assign_35_Vehicle {
	String brand;
	double price;
	
	public Assign_35_Bike() {
		
	}
	
	public Assign_35_Bike(String brand,String color,double price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void Bike_data() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price+" Lakh");
	}
}
