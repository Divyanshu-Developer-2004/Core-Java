package Operators;

public class Conditional_Ex3 {
	public static void main(String[] args) {
		int a=44,b=77,c=14;
		int d=(((a>b)?a:b)>c)?((a>b)?a:b):c;
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		System.out.println(big);
		System.out.println(d);
	}
}
