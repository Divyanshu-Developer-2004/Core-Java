package Inheritance;

public class Product {
	String brand;
	
	public Product(String brand) {
		this.brand=brand;
	}
	
	public static void main(String[] args) {
		Mobile m1=new Mobile("One Plus","Jio",45000.0);
		Laptop l1=new Laptop("HP","Intel i3",43000.0);
		m1.display();
		System.out.println();
		l1.display();
	}
}
