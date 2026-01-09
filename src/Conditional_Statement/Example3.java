package Conditional_Statement;

public class Example3 {
	public static void main(String[] args) {
		int a=10,b=33,c=21,d=5;
		int big=a;
		if(big<b) {
			big=b;
		}
		if(big<c) {
			big=c;
		}
		if(big<d) {
			big=d;
		}
		System.out.println(big);
	}
}
