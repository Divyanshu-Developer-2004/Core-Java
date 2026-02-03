package Recursion;

public class Factorial_of_Number {
	public static void main(String[] args) {
		System.out.println(fac(0));
	}
	
	public static int fac(int N) {
		if(N<=1)
			return 1;
		return N*fac(--N);
	}
}
