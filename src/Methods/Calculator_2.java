package Methods;

public class Calculator_2 {
	public static void main(String[] args) {
		char c ='+',a=25,b=11;
		switch (c) {
		case '+':
			System.out.println(Add(a,b));
			break;
		case '-':
			System.out.println(Sub(a,b));
			break;
		case '*':
			System.out.println(Mul(a,b));
			break;
		case '/':
			System.out.println(Div(a,b));
			break;
		case '%':
			System.out.println(Mod(a,b));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}

	public static long Add(int a, int b) {
		return a + b;
	}

	public static int Sub(int a, int b) {
		return a - b;
	}

	public static float Mul(int a, int b) {
		return a * b;
	}

	public static double Div(int a, int b) {
		return a / b;
	}

	public static byte Mod(int a, int b) {
		return (byte) (a % b);
	}
}
