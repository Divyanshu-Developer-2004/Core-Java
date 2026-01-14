package Static_Non_Static_And_Object;

public class HelpLaptop {
	public static Laptop1 getLaptop(String brand,Double price) {
		return new Laptop1(brand,price);
	}
	
	public static Laptop1 getLaptop() {
		return new Laptop1();
	}
}
