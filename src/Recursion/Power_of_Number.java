package Recursion;

public class Power_of_Number {
	public static void main(String[] args) {
		System.out.println(power(2,10));
	}
	
	public static long power(int a,int b) {
		if(b==0)
			return 1;
		return a*power(a,--b);
	}
}
