package Operators;

public class Logical {
	public static void main(String[] args) {
		byte a=101;
		int b=76;
		char e='Z';
		short f=225;
		float g=11.54f;
		double h=11.54;
		System.out.println((b<=a)&&(e<=a));
		System.out.println((b<=a)&&(e>=f));
		System.out.println((b<=a)||(e>=f));
		System.out.println((b>=a)||(e>=f));
		System.out.println(!(h==g));
	}
}
