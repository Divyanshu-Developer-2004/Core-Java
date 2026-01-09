package Operators;

public class Conditional_Ex2 {
	public static void main(String[] args) {
		int a=142,b=400,c=77,d=1111;
		int e=(((((a>b)?a:b)>c)?((a>b)?a:b):c)>d)?((((a>b)?a:b)>c)?((a>b)?a:b):c):d;
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		big=(big>d)?big:d;
		System.out.println("Greatest is : "+big);
		System.out.println("Greatest is : "+e);
	}
}
