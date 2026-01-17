package Polymorphism;

public class Math {
	public static void add(int a,int b) {
		System.out.println("2 int type");
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c) {
		System.out.println("3 int type");
		System.out.println(a+b+c);
	}
	
	public static void add(float a,float b) {
		System.out.println("2 float type");
		System.out.println(a+b);
	}
	
	public static void add(double a,double b) {
		System.out.println("2 double type");
		System.out.println(a+b);
	}
	
	public static void add(double a,double b,double c) {
		System.out.println("3 double type");
		System.out.println(a+b+c);
	}
	
	public static int add(int a,int b,int c,int d) {
		System.out.println("4 int type");
		return (a+b+c+d);
	}
	
	public double add(double a,double b,double c,double d) {
		System.out.println("4 double type");
		return (a+b+c+d);
	}
	
	public static void main(String[] args) {
		add(1,2);
		add(1,2,5);
		add(3.5f,5.1f);
		add(3.5,5.1);
		add(3.5,5.1,2.77);
		System.out.println(add(1,5,3,8));
		Math m=new Math();
		System.out.println(m.add(3.5,5.1,2.72,1.44));
	}
}
