package Inheritance;

public class Child3 extends Parent3{
	long phone;
	
	public Child3(String name,long phone) {
		super(name);
		this.phone=phone;
	}
	
	public static void main(String[] args) {
		Child3 c=new Child3("Aman",751148);
		System.out.println(c.name);
		System.out.println(c.phone);
	}
}
