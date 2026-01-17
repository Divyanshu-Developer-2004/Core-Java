package Inheritance;

public class Assign_35_Car extends Assign_35_Vehicle {
	String brand;
	double price;
	
	public Assign_35_Car() {
		
	}
	
	public Assign_35_Car(String brand,String color,double price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void Car_data() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price+" Lakh");
	}
	
	public static void main(String[] args) {
		Assign_35_Car c1=new Assign_35_Car("Tata","Cian",15.0);
		Assign_35_Bike b1=new Assign_35_Bike("Splender","Yellow",8.5);
		c1.Car_data();
		System.out.println();
		b1.Bike_data();
	}
}
