package Has_a_Relationship;
//Driver of Car and Engine
public class Driver1 {

	public static void main(String[] args) {
		Car c=new Car(1334,"BMW","Violet",120.0,"CNG");
		System.out.println("----------CAR--------------");
		System.out.println(c.getID());
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println("----------Engine--------------");
		System.out.println(c.getEngine().getCc());
		System.out.println(c.getEngine().getFuel_Type());
	}
}
