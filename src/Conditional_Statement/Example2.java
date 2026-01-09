package Conditional_Statement;

public class Example2 {
	public static void main(String[] args) {
		int a=10,b=44,c=11,d=61;
		int big1=(a>b)?a:b;
		int big2=(c>d)?c:d;
		if(big1>big2) {
			System.out.println(big1);
		}
		if(big2>big1) {
			System.out.println(big2);
		}
	}
}
