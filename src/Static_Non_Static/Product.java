package Static_Non_Static;

public class Product {
	
	int id;
	String name;
	Double price,rating;
	
	public Product(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public Product(int id,String name,double price,double rating) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	
	public void display() {
		System.out.println("Product ID : "+id);
		System.out.println("Product Name : "+name);
		System.out.println("Product Price : "+price);
		System.out.println("Prodect Rating : "+rating);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Product p1=new Product(1,"Apple");
		Product p2=new Product(2,"Chips",10);
		Product p3=new Product(3,"Milk",26,4);
		p1.display();
		p2.display();
		p3.display();
	}
}
