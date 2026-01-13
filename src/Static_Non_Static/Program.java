package Static_Non_Static;

public class Program {
	static {
		System.out.println("SB Program");
	}
	public static void palindrome(int a) {
		int n=a,n2=0;
		while(n!=0) {
			n2=(n2*10)+(n%10);
			n/=10;
		}
		if(a==n)
			System.out.println(a+" is Palindrome");
		else
			System.out.println(a+" is Not a Palindrome");
	}
	public static void prime(int a) {
		int n=a;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a Prime number");
				return;
			}
		}
		System.out.println(n+" is Prime Number");
	}
}
