package Abstraction;

public class Calculator_Child_1 extends Calculator{
	
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	
	@Override
	public int multi(int a,int b) {
		return a*b;
	}
	
	public void m1() {
		System.out.println("M1");
	}
	
	public static void main(String[] args) {
		//Calculator c=new Calculator();Cannot call abstract class
		Calculator c=new Calculator_Child_1();
		System.out.println(c.add(5, 5));//can call as the method is overriden by object reference
		System.out.println(c.multi(3, 4));
		System.out.println(c.sub(3, 4));
		//c.m1();Parent cannot access child member
		System.out.println();
		Calculator_Child_1 c1=new Calculator_Child_1();
		System.out.println(c1.add(3, 4));
		System.out.println(c1.multi(3, 4));
		System.out.println(c1.sub(3, 4));
	}
}
