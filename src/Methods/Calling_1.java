package Methods;

public class Calling_1 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		m1();
		System.out.println("Main End");
	}
	public static void m1() {
		m2();
		System.out.println("M1");
	}
	public static void m2() {
		System.out.println("M2");
		m3();
	}
	public static void m3() {
		m4();
		System.out.println("M3");
	}
	public static void m4() {
		System.out.println("M4");
	}
}
