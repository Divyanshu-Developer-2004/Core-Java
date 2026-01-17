package Static_Non_Static_And_Object;
public class Example_Static_non_static {
	static Student s1;//static
	Student s2;//non static
	int a1;
	static int a2;
	
	public Example_Static_non_static() {
		System.out.println();
		System.out.println("Constructor");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(this.s2);
	}
	public void m1() {
		System.out.println();
		System.out.println("M1");
		System.out.println(this.a1);
		System.out.println(a2);
		System.out.println(s2);
		System.out.println(s1);
	}
	
	public static void m2() {
		System.out.println();
		System.out.println("M2");
		Example_Static_non_static e=new Example_Static_non_static();
		System.out.println(e.a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(e.s2);
	}
	
	public static void main(String[] args) {
		Example_Static_non_static e=new Example_Static_non_static();
		e.m1();
		m2();
		
		
	}
}
