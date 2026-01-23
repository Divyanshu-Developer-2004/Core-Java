package Exception_Pacakage;

public class Example1 {
	
	public static void main(String[] args) {
		System.out.println("Hi");
		//Exception Handling
		try {
			System.out.println(8/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Zero");
		}
		System.out.println("Bye");
	}
}
