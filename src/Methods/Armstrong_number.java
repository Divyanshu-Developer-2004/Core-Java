package Methods;

public class Armstrong_number {
	public static void main(String[] args) {
		int n=16134;
		System.out.println(Armstrong(n));
	}
	//Armstrong checking
	private static String Armstrong(int n) {
		int a=n,sum=0;
		int c=count_digit(n);
		while(a!=0) {
			sum+=(power(a%10,c));
			a/=10;
		}
		if(n==sum) {
			return n+" is Armstrong Number";
		}
		else {
			return n+" is not an Armstrong Number";
		}
	}
	//Digit count
	public static int count_digit(int n) {
		int c=0;
		while(n>0) {
			c++;
			n/=10;
		}
		return c;
	}
	//Power Calculation
	public static int power(int b, int p) {
		int r=1;
		for(int i=1;i<=p;i++) {
			r*=b;
		}
		return r;
	}
	
}
