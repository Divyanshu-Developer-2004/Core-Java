package Static_Non_Static_And_Object;

public class Laptop1 {
	double price;
	String brand;
	
	public Laptop1(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	
	public Laptop1() {
		this.brand=null;
		this.price=0.0;
	}
	
	public void comparePrice(Laptop1 l){
		if(this.price <l.price)
			System.out.println(this.brand+" is Cheaper with price Rs "+this.price);
		else
			System.out.println(l.brand+" is Cheaper with price Rs "+l.price);
	}
	
	public static void main(String[] args) {
		Laptop1 l1=HelpLaptop.getLaptop("HP",45000.0);
		Laptop1 l2=HelpLaptop.getLaptop("ASUS",47000.0);
		Laptop1 l3=HelpLaptop.getLaptop();
		l1.comparePrice(l2);
		l2.comparePrice(l3);
	}
}
