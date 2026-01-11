package Methods;

public class Power {
	public static void main(String[] args) {
		int b=2,p=3;
		int r=power(b,p);
		System.out.println(+b+" to the power "+p+" is "+r);
	}

	private static int power(int b, int p) {
		int r=1;
		for(int i=1;i<=p;i++) {
			r*=b;
		}
		return r;
	}
	
}
