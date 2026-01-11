package Methods;

public class Prime_check {
	public static void main(String[] args) {
		int n=277;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a Prime number");
				return;
			}
		}
		System.out.println(n+" is Prime Number");
	}
}
