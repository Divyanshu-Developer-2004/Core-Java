package Polymorphism;

public class Child extends Parent{
	@Override
	public void home() {
		System.out.println("Red");
	}
	
	public void bike() {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.home();
		//p.bike();
		Child c=new Child();
		c.home();
		c.bike();
		Parent p1=new Child();
		p1.home();//Child home is called
		//p1.bike();
	}
}
