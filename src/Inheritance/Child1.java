package Inheritance;

public class Child1 extends Parent1 {
	int b=20;
	public static void main(String[] args) {
		Child1 c=new Child1();
		System.out.println(c.b);
		System.out.println(c.a);
		c.m1();
		Parent1 p=new Parent1();
		System.out.println(p.a);
		//System.out.println(p.b); parent cannot access characteristics from child
		p.m1();
	}
}
