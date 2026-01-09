package Operators;

public class Assignment {
	public static void main(String[] args) {
		byte a=101;
		int b=76;
		float c=44.54f;
		double d=60.66;
		char e='Z';
		short f=225;
		a+=b;
		System.out.println(a);
		c+=d;
		a-=e;
		e+=a;
		System.out.println(a);
		System.out.println(c);
		System.out.println(e);
		e='Z';
		c*=d;
		e*=b;
		System.out.println(c);
		System.out.println(e);
		f/=c;
		c/=e;
		System.out.println(f);
		System.out.println(c);
		f%=a;
		a%=c;
		System.out.println(a);
		System.out.println(f);
	}
}
