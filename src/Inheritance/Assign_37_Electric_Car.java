package Inheritance;

public class Assign_37_Electric_Car extends Assign_37_Car {
	String brand;
	String type="Electric";
	
	Assign_37_Electric_Car(){
		
	}
	
	Assign_37_Electric_Car(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void car_data() {
		System.out.println(brand);
		System.out.println(type);
		display_car();
	}
}
