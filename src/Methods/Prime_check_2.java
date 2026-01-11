package Methods;

public class Prime_check_2 {
	public static void main(String[] args) {
		int n=277;
		if(Prime(n)) {
			System.out.println(n+" is Prime Number");
		}
		else {
			System.out.println(n+" is not Prime Number");
		}
	}
	public static boolean Prime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
