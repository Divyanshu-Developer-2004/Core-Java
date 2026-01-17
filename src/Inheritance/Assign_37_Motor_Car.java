package Inheritance;

public class Assign_37_Motor_Car extends Assign_37_Car {
	String brand;
	String type="Motor";
	
	Assign_37_Motor_Car(){
		
	}
	
	Assign_37_Motor_Car(String brand,String color,double price){
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
