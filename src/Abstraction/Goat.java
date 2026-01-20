package Abstraction;

public class Goat implements Animal {
	
	public void sound() {
		System.out.println("Maaaeeeee");
	}
	
	public void color() {
		System.out.println("Brown");
	}
	
	public static void main(String[] args) {
		Animal a1=new Goat();
		Animal a2=new Cow();
		Animal a3=new Dog();
		Dog a4=(Dog)a3;
		System.out.println("-----Up Cast----------");
		a1.sound();
		a1.color();
		System.out.println();
		a2.sound();
		a2.color();
		System.out.println();
		a3.sound();
		a3.color();
		System.out.println("-----Down Cast----------");
		a4.sound();
		a4.color();
	}
}

class Cow implements Animal {
	
	public void sound() {
		System.out.println("Mooooooo");
	}
	
	public void color() {
		System.out.println("White");
	}
}

class Dog implements Animal {
	
	public void sound() {
		System.out.println("Bhauuuu");
	}
	
	public void color() {
		System.out.println("Black");
	}
}
