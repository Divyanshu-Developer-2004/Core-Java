package Static_Non_Static;

public class Example1_Static_Variable {
	static int a=10;
	static int b;
	final static String pm="Narendra Modi";
	static String c;
	public static void main(String[] args) {
		e1();
		e2();
		e3();
		Student.change();//static method
	}
	public static void e1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(pm);
		System.out.println(c);
	}
	public static void e2() {
		int a=20;
		System.out.println(a);//local variable
		System.out.println(Example1_Static_Variable.a);//global variable
	}
	public static void e3() {//access from different class
		System.out.println(Student.name);
	}
}
