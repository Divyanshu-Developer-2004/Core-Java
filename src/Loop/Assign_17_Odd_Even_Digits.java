package Loop;

public class Assign_17_Odd_Even_Digits {
	public static void main(String[] args) {
		int n=125488,o=0,e=0,a=n;
		while(a>0) {
			int b=a%10;
			if(b%2==0) {
				e++;
			}
			if(b%2!=0) {
				o++;
			}
			a/=10;
		}
		System.out.println(n+" has "+o+" odd digits and "+e+" even digits");
	}
}
