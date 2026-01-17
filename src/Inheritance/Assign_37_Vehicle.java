package Inheritance;

public class Assign_37_Vehicle {
	String color;
	
	public static void main(String[] args) {
		Assign_37_Electric_Bike b1= new Assign_37_Electric_Bike("Bajaj","Red",2.5);
		Assign_37_Motor_Bike b2=new Assign_37_Motor_Bike("Royal Enfield","Black",5.4);
		Assign_37_Electric_Car c1=new Assign_37_Electric_Car("Tesla","Grey",24.9);
		Assign_37_Motor_Car c2=new Assign_37_Motor_Car("BMW","Jet Black",102.7); 
		b1.bike_data();
		System.out.println();
		b2.bike_data();
		System.out.println();
		c1.car_data();
		System.out.println();
		c2.car_data();
	}
}
