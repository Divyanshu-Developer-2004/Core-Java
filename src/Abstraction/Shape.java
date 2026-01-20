package Abstraction;

public abstract class Shape {
	
	{
		System.out.println("NSB");
	}
	
	static {
		System.out.println("SB");
	}
	
	public abstract void area();
	
	public void display() {
		area();
	}
}

class Circle extends Shape {
	
	public void area() {
		System.out.println("Area of Circle is pi*radius*radius");
	}
}

class Rectangle extends Shape {
	
	public void area() {
		System.out.println("Area of Rectangle is length*breadth");
	}
}

