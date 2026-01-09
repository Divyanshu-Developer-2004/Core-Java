package Loop;
public class Prime_check_1_1 {
	public static void main(String[] args) {
		int n=47,flag=1;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag=0;
				break;
			}
		}
		if (flag==1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime number");
		}
	}
}
