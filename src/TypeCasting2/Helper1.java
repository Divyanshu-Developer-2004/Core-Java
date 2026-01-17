package TypeCasting2;

public class Helper1 {
	
	public static void getVehicle(Vehicle v) {
		if(v instanceof Car) {
			Car o=(Car)v;
			System.out.println(o.getClass().getSimpleName());//getClass to get object type and getSimpleName() to convert ti simple string to print
			o.noOfPassenger();
		}
		if(v instanceof Bike) {
			Bike o=(Bike)v;
			o.topSpeed();
		}
		if(v instanceof Train) {
			Train o=(Train)v;
			o.trainticket();
		}
	}
	
	public static void main(String[] args) {
		getVehicle(new Train());
		getVehicle(new Car());
		getVehicle(new Bike());
	}
}
