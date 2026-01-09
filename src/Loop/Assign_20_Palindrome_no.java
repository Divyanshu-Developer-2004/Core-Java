package Loop;

public class Assign_20_Palindrome_no {
	public static void main(String[] args) {
		int n=13431,a=n,n2=0;
		while(a>0) {
			n2=(n2*10)+(a%10);
			a/=10;
		}
		if(n2==n) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
	}
}
