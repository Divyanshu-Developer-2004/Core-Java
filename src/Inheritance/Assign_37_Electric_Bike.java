package Inheritance;

public class Assign_37_Electric_Bike extends Assign_37_Bike {
	String brand;
	String type="Electric";
	
	Assign_37_Electric_Bike(){
		
	}
	
	Assign_37_Electric_Bike(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void bike_data() {
		System.out.println(brand);
		System.out.println(type);
		display_bike();
	}
}
