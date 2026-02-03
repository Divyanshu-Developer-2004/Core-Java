package Recursion;

public class Sum_Of_N_Natural_Numbers {
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	
	public static int sum(int N) {
		if(N==1)
			return 1;
		return N+sum(--N);
	}
}
