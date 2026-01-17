package Polymorphism;

public class Child2 extends Parent2{

	public static void home() {
		System.out.println("Child");
	}
	
	public void bike() {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		Parent2 p=new Parent2();
		p.home();
		//p.bike();
		Child2 c=new Child2();
		c.home();
		c.bike();
		Parent2 p1=new Child2();
		p1.home();//Parent home is called
		//p1.bike();
	}
}
