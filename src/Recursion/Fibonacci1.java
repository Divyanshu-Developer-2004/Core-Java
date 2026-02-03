package Recursion;

public class Fibonacci1 {
	public static void main(String[] args) {
		System.out.println(fibbonacci(1000,0,1));
	}
	
	public static int fibbonacci(int N) {
		int a=0;
		int b=1;
		for(int i=2;i<N;i++) {
			int temp=b;
			b=b+a;
			a=temp;
		}
		if(N==1)
			return a;
		return b;
	}
	
	public static long fibbonacci(int N,long a,long b) {
		if(N==1)
			return b;
		if(N==0)
			return a;
		else {
			long temp=b;
			b=b+a;
			a=temp;
			return fibbonacci(--N, a, b);
		}
	}
	
	public static int fibbonacci1(int N) {
		if(N<=1)
			return N;
		else
			return fibbonacci1(N-1)+fibbonacci1(N-2);
	}
}
