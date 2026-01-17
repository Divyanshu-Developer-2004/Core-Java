package Inheritance;

public class Apple extends Fruit {
	
	int price;
	
	Apple(String name,String color,int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	Apple(){
		
	}
	
	public void AppleDetail() {
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Apple f1=new Apple("Kashmiri","Red",200);
		f1.FruitDetail();
		f1.AppleDetail();
	}
}
