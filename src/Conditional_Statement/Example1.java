package Conditional_Statement;

public class Example1 {
	public static void main(String[] args) {
			int a=44,b=60,c=71;
			int big;
			if(a>b) {
				big=a;
			}
			else {
				big=b;
			}
			if(big<c) {
				big=c;
			}
			System.out.println(big);
	}
}
