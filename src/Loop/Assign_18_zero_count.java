package Loop;

public class Assign_18_zero_count {
	public static void main(String[] args) {
		int n=1208700,a=n,c=0;
		while(a>0) {
			if(a%10==0) {
				c++;
			}
			a/=10;
		}
		System.out.println(n+" has "+c+" zeros");
	}
}
