package AM;

public class Example {
	
	public static String a="Private";

	private static void m1() {
		System.out.println("Private Method");
	}
	
	protected Example() {
		System.out.println("Private Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Example e=new Example();
	}
}
