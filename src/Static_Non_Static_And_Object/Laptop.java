package Static_Non_Static_And_Object;

public class Laptop {
	
	double price;
	String brand;
	
	public Laptop(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	
	public void comparePrice(Laptop l){
		if(this.price <l.price)
			System.out.println(this.brand+" is Cheaper with price Rs "+this.price);
		else
			System.out.println(l.brand+" is Cheaper with price Rs "+l.price);
	}
	
	public static void main(String[] args) {
		Laptop l1=new Laptop("HP",45000.0);
		Laptop l2=new Laptop("ASUS",47000.0);
		l1.comparePrice(l2);
	}
}
