package Operators;

public class Relational {
	public static void main(String[] args) {
		byte a=101;
		int b=76;
		float c=44.54f;
		double d=60.66;
		char e='Z';
		short f=225;
		float g=11.54f;
		double h=11.54;
		System.out.println(b<a);
		System.out.println(d<c);
		System.out.println(e>c);
		System.out.println(f>d);
		System.out.println(g<=h);
		System.out.println(d<=c);
		System.out.println(h>=e);
		System.out.println(h>=g);
		System.out.println(h==g);
		System.out.println(h==d);
		System.out.println(g!=h);
		System.out.println(g!=e);
	}
}
