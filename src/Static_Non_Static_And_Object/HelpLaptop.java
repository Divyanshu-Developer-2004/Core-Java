package Static_Non_Static_And_Object;

public class HelpLaptop {//Creating Helper functions here
	public static Laptop1 getLaptop(String brand,double price) {
		return new Laptop1(brand,price);
	}
	
	public static Laptop1 getLaptop() {
		return new Laptop1();
	}
	
	public static Laptop1 Laptop_Price_Verification(String Brand,double price) {
		if(price<10000 || price>500000) {
			System.out.println(Brand+" Invalid Price");
			return null;
		}
		else {
			System.out.println(Brand+" Valid Price");
			return new Laptop1(Brand,price);
		}
	}
}

