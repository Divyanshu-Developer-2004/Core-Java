package Methods;

public class Greatest_Smallest {
	public static void main(String[] args) {
		int a=47,b=14,c=98;
		Greatest(a, b, c);
		Smallest(a, b, c);
	}
	public static void Greatest(int a,int b,int c) {
		System.out.println((((a>b)?a:b)>c)?((a>b)?a:b):c);
	}
	public static void Smallest(int a,int b,int c) {
		System.out.println((((a<b)?a:b)<c)?((a<b)?a:b):c);
	}
}
