package Loop;

public class Sum_digit {
	public static void main(String[] args) {
		int n=5475,a,sum=0;
		while(n>0) {
			a=n%10;
			sum+=a;
			n/=10;
		}
		System.out.println("Sum of Digits : "+sum);
	}
}
