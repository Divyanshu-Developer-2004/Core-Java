package Inheritance;

public class Animal {
	String name;
	String color;
	int leg_count;
	
	public void printAnimal() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(leg_count);
	}
	
	public static void main(String[] args) {
		Dog a1=new Dog("Dogesh","Black",4);
		a1.printAnimal();
	}
}

class Dog extends Animal{
	
	Dog(String name,String color,int leg_count){
		this.name=name;
		this.color=color;
		this.leg_count=leg_count;
	}
}