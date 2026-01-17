package TypeCasting2;

public class Vehicle {
	public void travel() {
		System.out.println("Travelling");
	}
	
	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		v.travel();
		// v.noOfPassenger();
		System.out.println();
		Car c1=(Car)v;
		c1.travel();
		c1.noOfPassenger();
		System.out.println();
		
		v=new Bike();
		v.travel();
		// v.topSpeed();
		System.out.println();
		Bike b1=(Bike)v;
		b1.travel();
		b1.topSpeed();
		System.out.println();
		
		// Train t2=(Train)v; ClassTypeCasting Error
		
		v=new Train();
		v.travel();
		// v.trainticket();
		System.out.println();
		Train t1=(Train)v;
		t1.travel();
		t1.trainticket();
		
	}
}
