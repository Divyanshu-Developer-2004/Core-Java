package Static_Non_Static;

public class Example_Static_Block {
	static {
		int a=5;//its a local variable
		System.out.println(a);
		System.out.println("SB1");
	}
	static {
		System.out.println("SB2");
	}
	public static void main(String[] args) {
		System.out.println("Main");
		Program.prime(47);//Static Block of Program is also executed
	}
	static {
		System.out.println("SB3");
	}
}
