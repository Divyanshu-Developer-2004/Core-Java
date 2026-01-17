package Polymorphism;

public class FindMax {
	
	public int max(int a,int b) {
		return (a>b)?a:b;
	}
	
	public int max(int a,int b,int c) {
		return max(a,max(b,c));
	}
	
	public double max(double a,double b) {
		return (a>b)?a:b;
	}
	
	public float max(int a,float b) {
		return (a>b)?a:b;
	}
	
	public static void main(String[] args) {
		FindMax f=new FindMax();
		System.out.println("Max is "+f.max(1,2));
		System.out.println("Max is "+f.max(1,2,5));
		System.out.println("Max is "+f.max(1.44,1.65));
		System.out.println("Max is "+f.max(4,2.5));
		//System.out.println("Max is "+f.max(1,2));
	}
}
