package Methods;

public class Calculator {
	public static void main(String[] args) {
		Add(21,12);
		Sub(21,12);
		Mul(21,12);
		Div(21,12);
		Mod(21,12);
	}
	public static void Add(int a,int b) {
		System.out.println(a+b);
	}
	public static void Sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void Mul(int a,int b) {
		System.out.println(a*b);
	}
	public static void Div(int a,int b) {
		System.out.println(a/b);
	}
	public static void Mod(int a,int b) {
		System.out.println(a%b);
	}
}
