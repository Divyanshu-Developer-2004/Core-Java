package Methods;

public class Power_Count_digit {
	public static void main(String[] args) {
		int n=54786,b=20,p=4;
		int c=count_digit(n);
		System.out.println("Number of Digit in "+n+" is "+c);
		int r=power(b,p);
		System.out.println(+b+" to the power "+p+" is "+r);
	}

	private static int count_digit(int n) {
		int c=0;
		while(n>0) {
			c++;
			n/=10;
		}
		return c;
	}
	private static int power(int b, int p) {
		int r=1;
		for(int i=1;i<=p;i++) {
			r*=b;
		}
		return r;
	}
}
