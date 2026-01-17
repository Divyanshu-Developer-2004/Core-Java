package Inheritance;

public class Parent2 {
	public void m1() {
		System.out.println("Parent");
	}
	
	public static void main(String[] args) {
		Parent2 p=new Child2();//Up Casting
		p.m1();
		//p.m2(); Doesn't work
		System.out.println();
		Child2 c=(Child2)p;//Down Casting
		c.m1();
		c.m2();
		
	}
}
